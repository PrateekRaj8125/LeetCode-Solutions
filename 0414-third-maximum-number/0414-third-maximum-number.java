class Solution {
    public int thirdMax(int[] nums) {
        int max=1,i=nums.length-2;
        Arrays.sort(nums);
        while(max<3 &&i>=0){
            if(nums[i]!=nums[i+1])
                max++;
            i--;
        }
        if(max==3)
            return nums[i+1];
        else
            return nums[nums.length-1];
    }
}