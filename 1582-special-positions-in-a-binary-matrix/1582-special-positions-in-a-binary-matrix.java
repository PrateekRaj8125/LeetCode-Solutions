class Solution {
    public int numSpecial(int[][] mat) {
        int ctr=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1&&checkMatrix(mat,i,j))
                    ctr++;
            }
        }
        return ctr;
    }
    boolean checkMatrix(int[][] mat,int i,int j){
        int ctr=0;
        for(int row=0;row<mat.length;row++)
            if(mat[row][j]==1)
                ctr++;
        if(ctr!=1)
            return false;
        ctr=0;
        for(int column=0;column<mat[0].length;column++)
            if(mat[i][column]==1)
                ctr++;
        if(ctr!=1)
            return false;
        return true;
    }
}