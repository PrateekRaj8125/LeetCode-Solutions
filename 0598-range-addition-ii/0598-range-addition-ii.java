class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0)
            return m*n;
        int i_min=ops[0][0], j_min=ops[0][1];
        for(int i=1;i<ops.length;i++){
            i_min=Math.min(i_min,ops[i][0]);
            j_min=Math.min(j_min, ops[i][1]);
        }
        return (i_min*j_min);
    }
}