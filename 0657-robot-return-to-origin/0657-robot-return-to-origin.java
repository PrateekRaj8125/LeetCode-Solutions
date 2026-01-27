class Solution {
    public boolean judgeCircle(String moves) {
        moves=moves.toUpperCase();
        int x=0,y=0;
        char[] move=moves.toCharArray();
        for(int i=0;i<move.length;i++){
            switch (move[i]){
                case 'U':
                    y++;
                break;
                case 'D':
                    y--;
                break;
                case 'R':
                    x++;
                break;
                case 'L':
                    x--;
                break;
                default:
                break;
            }
        }
        if(x==0&&y==0)
            return true;
        else
            return false;
    }
}