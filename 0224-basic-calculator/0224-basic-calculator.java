class Solution {
    int i=0;
    public int calculate(String s) {
        int ans = 0, sign = 1, num = 0;
        while (i<s.length()) {
            char c = s.charAt(i++);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); 
            } 
            else if (c == '+' || c=='-') {
                ans += sign * num;
                num = 0;
                sign = c=='-' ? -1:1;
            } 
            
            else if (c == '(') {
                num = calculate(s);
            } 
            else if (c == ')') {
                break;
            }
        }
        ans += sign * num; 
        return ans;
    }
}
