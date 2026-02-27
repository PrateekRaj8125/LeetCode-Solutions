class Solution {
    public int pivotIndex(int[] nums) {
        if(rightSum(nums,1)==0)
            return 0;
        for(int i=1;i<nums.length-1;i++){
            if(leftSum(nums,i-1)==rightSum(nums,i+1))
                return i;
        }
        if(leftSum(nums,nums.length-2)==0)
            return nums.length-1;
        return -1;
    }
    private int leftSum(int[] nums,int n){
        int sum=0;
        for(int i=0;i<=n;i++)
            sum+=nums[i];
        return sum;
    }
    private int rightSum(int[] nums,int n){
        int sum=0;
        for(int i=n;i<nums.length;i++)
            sum+=nums[i];
        return sum;
    }
}