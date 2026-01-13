class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0)
            return m*n;
        int i_min=Integer.MAX_VALUE, j_min=Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++){
            i_min=Math.min(i_min,ops[i][0]);
            j_min=Math.min(j_min, ops[i][1]);
        }
        return (i_min*j_min);
    }
}