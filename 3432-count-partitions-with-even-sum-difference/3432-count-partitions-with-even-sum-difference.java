class Solution {
    public int countPartitions(int[] nums) {
        int ctr=0,n=nums.length;
        for(int i=0;i<n-1;i++){
            int s1=0,s2=0;
            for(int j=0;j<=i;j++)
                s1+=nums[j];
            for(int j=i+1;j<n;j++)
                s2+=nums[j];
            ctr+=(s1-s2)%2==0?1:0;
        }
        return ctr;
    }
}