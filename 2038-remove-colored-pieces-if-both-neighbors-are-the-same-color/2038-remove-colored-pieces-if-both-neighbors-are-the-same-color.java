class Solution {
    public boolean winnerOfGame(String colors) {
    int x = 0, y=0, a=0, b=0;
    for(char c:colors.toCharArray()){
        if(c == 'A'){
            x++;
            y=0;
        }
        else {
            y++;
            x=0;
        }
        if(x>=3) a++;
        if(y>=3) b++;
    }
    return a>b;
    }
}