class Solution {
     public int divide(int div, int d) {
        if (div == Integer.MIN_VALUE && d == -1) return Integer.MAX_VALUE; 
        boolean ne = div < 0 ^ d < 0; 
        div = Math.abs(div);
        d = Math.abs(d);
        int q = 0, sq = 0;
        while (div - d >= 0) {
            for (sq = 0; div - (d << sq << 1) >= 0; sq++);
            q += 1 << sq;
            div -= d << sq; 
        }
        return ne ? -q : q;
    }
}