class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxdiagonal=0.0;
        int maxarea=0;
        for(int i=0;i<dimensions.length;i++){
            int l=dimensions[i][0];
            int w=dimensions[i][1];
            int area=l*w;
            double diagonal=Math.sqrt(((l*l)+(w*w)));
            if(diagonal>maxdiagonal){
                maxdiagonal=diagonal;
                maxarea=area;
            } else if (diagonal == maxdiagonal && area > maxarea) {
                maxarea = area;
            }
        }
        return maxarea;
    }
}