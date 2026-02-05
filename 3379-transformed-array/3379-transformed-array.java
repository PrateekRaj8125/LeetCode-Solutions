class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                int j=i+nums[i];
                while(j>n-1)
                    j-=n;
                result[i]=nums[j];
            }
            if(nums[i]==0)
                result[i]=nums[i];
            if(nums[i]<0){
                int j=i+nums[i];
                while(j<0)
                    j+=n;
                result[i]=nums[j];
            }
        }
        return result;
    }
}