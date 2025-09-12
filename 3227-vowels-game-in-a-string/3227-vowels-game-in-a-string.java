class Solution {
    public boolean doesAliceWin(String s) {
        List<Character> li = Arrays.asList('a','e','i','o','u');
        for(int i=0;i<s.length();i++){
            if(li.contains(s.charAt(i))) return true;
        }
        return false;
    }
}