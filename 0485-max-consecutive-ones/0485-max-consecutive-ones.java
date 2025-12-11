class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,ctr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                ctr++;
            else{
                max=Math.max(ctr,max);
                ctr=0;
            }
        }
        return Math.max(max,ctr);
    }
}