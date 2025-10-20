class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        Arrays.sort(nums);
        int idx = 0;
        for (int i = 0; i < nums.length; ) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                res[idx++] = nums[i];
                i++;
            } else {
                i += 2;
            }
            if (idx == 2) break;
        }
        return res;
    }
}
