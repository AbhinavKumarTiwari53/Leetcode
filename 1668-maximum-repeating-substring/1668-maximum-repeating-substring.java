class Solution {
    public int maxRepeating(String sequence, String word) {
        int i=0;
        String temp=word;
        while(sequence.contains(temp)){
            temp+=word;
            i++;
        }
        return i;
    }
}