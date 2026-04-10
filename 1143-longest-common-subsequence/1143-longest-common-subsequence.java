import java.util.*;

class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        // 항상 text2를 더 짧게 두는 게 유리 (bitset/DP 모두)
        if (text1.length() < text2.length()) {
            String t = text1; text1 = text2; text2 = t;
        }

        // 보통 LeetCode LCS는 소문자/ASCII라 bitset이 매우 유리.
        // text2 길이가 커도 bitset(long[])로 처리 가능.
        // 다만 문자가 256 범위를 넘어가면(유니코드) 마스크 생성이 복잡해지니 1D로 fallback.
        if (isAscii(text1) && isAscii(text2)) {
            return lcsBitsetGeneral(text1, text2);
        } else {
            return lcs1D(text1, text2);
        }
    }

    private boolean isAscii(String s) {
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) > 255) return false;
        return true;
    }

    /**
     * Bit-parallel LCS length for arbitrary |b|.
     * Time ~ O(|a| * (|b|/64)), Space O(256 * (|b|/64)).
     * Returns length only.
     */
    private int lcsBitsetGeneral(String a, String b) {
        final int m = b.length();
        final int words = (m + 63) >>> 6;

        // masks[c][k] = b에서 문자 c가 등장하는 위치 비트셋(64-bit 블록 k)
        long[][] masks = new long[256][words];
        for (int j = 0; j < m; j++) {
            int c = b.charAt(j) & 0xFF;
            masks[c][j >>> 6] |= 1L << (j & 63);
        }

        long[] S = new long[words];      // DP bitset state
        long[] X = new long[words];
        long[] Y = new long[words];
        long[] XM = new long[words];     // X - Y
        long[] T = new long[words];      // temp (~(X-Y))

        for (int i = 0; i < a.length(); i++) {
            long[] M = masks[a.charAt(i) & 0xFF];

            // X = M | S
            for (int k = 0; k < words; k++) X[k] = M[k] | S[k];

            // Y = (S << 1) | 1
            long carry = 0L;
            for (int k = 0; k < words; k++) {
                long nextCarry = S[k] >>> 63;
                Y[k] = (S[k] << 1) | carry;
                carry = nextCarry;
            }
            Y[0] |= 1L;

            // XM = X - Y (big-int subtraction with borrow)
            long borrow = 0L;
            for (int k = 0; k < words; k++) {
                long xk = X[k];
                long yk = Y[k];
                long sub = xk - yk - borrow;
                // borrow 계산: unsigned 비교 기반
                long yPlusBorrow = yk + borrow;
                borrow = (Long.compareUnsigned(xk, yPlusBorrow) < 0) ? 1L : 0L;
                XM[k] = sub;
            }

            // T = ~(X - Y)
            for (int k = 0; k < words; k++) T[k] = ~XM[k];

            // S = X & T
            for (int k = 0; k < words; k++) S[k] = X[k] & T[k];
        }

        // 마지막 워드의 초과 비트는 무시되도록 마스킹 (정확도/bitCount 보정)
        int extra = (words << 6) - m;
        if (extra > 0) {
            long mask = -1L >>> extra; // m 비트만 1
            S[words - 1] &= mask;
        }

        int ans = 0;
        for (int k = 0; k < words; k++) ans += Long.bitCount(S[k]);
        return ans;
    }

    /**
     * Classic 1D DP fallback (O(n*m)).
     * Minor micro-opts: char[], local vars, no Math.max call.
     */
    private int lcs1D(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        int[] dp = new int[m + 1];
        for (int i = 1; i <= n; i++) {
            int prevDiag = 0;
            char ca = a[i - 1];
            for (int j = 1; j <= m; j++) {
                int up = dp[j];
                if (ca == b[j - 1]) {
                    dp[j] = prevDiag + 1;
                } else {
                    int left = dp[j - 1];
                    dp[j] = (up >= left) ? up : left;
                }
                prevDiag = up;
            }
        }
        return dp[m];
    }
}