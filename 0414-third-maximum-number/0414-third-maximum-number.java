class Solution {
    public int thirdMax(int[] nums) {
        int max=1;
        Arrays.sort(nums);
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]!=nums[i+1])
                max++;
            if(max==3)
                return nums[i];
        }
        return nums[nums.length-1];
    }
}