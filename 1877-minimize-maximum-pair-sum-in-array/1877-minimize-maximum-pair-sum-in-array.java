class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int front=0,end=nums.length-1;
        int[] sums=new int[nums.length/2];
        while(front<=end){
            sums[front]=nums[front]+nums[end];
            front++;
            end--;
        }
        int max=0;
        for(int i=0;i<sums.length;i++)
            max=Math.max(max,sums[i]);
        return max;
    }
}