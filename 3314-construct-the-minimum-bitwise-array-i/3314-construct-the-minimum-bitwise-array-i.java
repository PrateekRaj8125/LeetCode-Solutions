class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int j=1;
            while((j|(j+1))!=nums.get(i)&&j<nums.get(i))
                j++;
            if(j==nums.get(i))
                ans[i]=-1;
            else
                ans[i]=j;
        }
        return ans;
    }
}