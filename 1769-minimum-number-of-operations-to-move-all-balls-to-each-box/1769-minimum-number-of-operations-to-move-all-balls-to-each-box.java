class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length(),prefixCount=0,prefixSum=0,suffixCount=0,suffixSum=0;
        int[] distances = new int[n];
        for (int i = 0; i < n; ++i) {
            distances[i] = prefixCount * i - prefixSum;
            if (boxes.charAt(i) == '1') {
                ++prefixCount;
                prefixSum += i;
            }
        }
        for (int i = n - 1; i >= 0; --i) {
            distances[i]+=suffixSum-suffixCount*i;
            if (boxes.charAt(i) == '1'){
                ++suffixCount;
                suffixSum += i;
            }
        }
        return distances;
    }
}