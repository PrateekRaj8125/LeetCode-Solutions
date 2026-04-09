class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] n1=new int[n];
        int[] n2=new int[n];
        for(int i=0;i<n;i++)
            n1[i]=nums[i];
        for(int i=0;i<n;i++)
            n2[i]=nums[n+i];
            int ctr1=0,ctr2=0;
        for(int i=0;i<nums.length;i++)
            if(i%2==0)
                nums[i]=n1[ctr1++];
            else
                nums[i]=n2[ctr2++];
        return nums;
    }
}