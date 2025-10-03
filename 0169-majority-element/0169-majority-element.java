class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int majority_element=nums[0];
        int ctr=1,pctr=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                ctr++;
            else{
                if(ctr>pctr){
                    pctr=ctr;
                    majority_element=nums[i-1];
                }
                ctr=1;
            }
        }
        if (ctr > pctr) {
            majority_element=nums[nums.length-1];
        }
        return majority_element;
    }
}