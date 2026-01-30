class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] frequency = new int[n+1];
        int missing=0;
        int repeated=0;
        for(int i=0; i<n; i++){
            frequency[nums[i]]++;
        }
        for(int i=1; i<=n; i++){
            if(frequency[i]==2){
                repeated = i;
            }
            if(frequency[i]==0){
                missing = i;
            }
        }
        int[] ans = {repeated,missing};
        return ans;
    }
}