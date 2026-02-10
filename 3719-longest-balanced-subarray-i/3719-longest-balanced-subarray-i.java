class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        for (int size = n; size >= 1; size--) {
            HashMap<Integer, Integer> even = new HashMap<>();
            HashMap<Integer, Integer> odd = new HashMap<>();
            for (int i = 0; i < size; i++) {
                if (nums[i] % 2 == 0) {
                    even.put(nums[i], even.getOrDefault(nums[i], 0) + 1);
                } else {
                    odd.put(nums[i], odd.getOrDefault(nums[i], 0) + 1);
                }
            }
            if (even.size() == odd.size()) return size;
            int start = 0, end = size;
            while (end < n) {
                int out = nums[start++];
                if (out % 2 == 0) {
                    even.put(out, even.get(out) - 1);
                    if (even.get(out) == 0) even.remove(out);
                } else {
                    odd.put(out, odd.get(out) - 1);
                    if (odd.get(out) == 0) odd.remove(out);
                }
                int in = nums[end++];
                if (in % 2 == 0) {
                    even.put(in, even.getOrDefault(in, 0) + 1);
                } else {
                    odd.put(in, odd.getOrDefault(in, 0) + 1);
                }

                if (even.size() == odd.size()) return size;
            }
        }
        return 0;
    }
}
