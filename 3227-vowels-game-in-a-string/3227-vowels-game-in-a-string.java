class Solution {
    public boolean doesAliceWin(String s) {
        List<Character> li = Arrays.asList('a','e','i','o','u');
        int c = 0;
        for(int i=0;i<s.length();i++){
            if(li.contains(s.charAt(i))) c++;
        }
        if(c == 0) return false;
        return true;
    }
}