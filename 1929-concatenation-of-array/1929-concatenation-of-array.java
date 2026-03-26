class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
            ans[i]=nums[i];
        for(int i=0,j=nums.length;i<nums.length;i++,j++)
            ans[j]=nums[i];
        return ans;
    }
}