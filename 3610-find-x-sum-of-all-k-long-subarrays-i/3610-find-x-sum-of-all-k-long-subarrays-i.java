class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] answer = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            int[] freq = new int[51];
            for (int j = i; j < i + k; j++) {
                freq[nums[j]]++;
            }
            int[][] pairs = new int[51][2];
            int size = 0;
            for (int num = 1; num <= 50; num++) {
                if (freq[num] > 0) {
                    pairs[size][0] = num;       
                    pairs[size][1] = freq[num]; 
                    size++;
                }
            }
            Arrays.sort(pairs, 0, size, (a, b) -> {
                if (a[1] != b[1]) return b[1] - a[1];
                return b[0] - a[0];
            });
            int sum = 0;
            for (int j = 0; j < Math.min(x, size); j++) {
                int num = pairs[j][0];
                int count = pairs[j][1];
                sum += num * count;
            }
            answer[i] = sum;
        }
        return answer;
    }
}
