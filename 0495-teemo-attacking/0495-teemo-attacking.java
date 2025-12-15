class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        Arrays.sort(timeSeries);
        int sum=0;
        for(int i=0;i<timeSeries.length-1;i++){
            int initial=timeSeries[i];
            int finalt=timeSeries[i]+duration-1;
            int diff=finalt-initial+1;
            if(finalt>=timeSeries[i+1])
                diff=timeSeries[i+1]-initial;
            sum+=diff;
        }
        sum+=duration;
        return sum;
    }
}