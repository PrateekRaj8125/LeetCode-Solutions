class Solution {
    public int countNegatives(int[][] grid) {
        int ctr=0;
        for(int i=0;i<grid.length;i++){
            int j=grid[i].length-1;
            while(j>=0&&grid[i][j]<0){
                ctr++;
                j--;
            }
        }
        return ctr;
    }
}