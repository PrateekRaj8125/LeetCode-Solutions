class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersection = new ArrayList<>();
        int[] smallerArray;
        int[] biggerArray;
        if (nums1.length > nums2.length) {
            smallerArray = nums2;
            biggerArray = nums1;
        } else {
            smallerArray = nums1;
            biggerArray = nums2;
        }
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : smallerArray) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : biggerArray) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                intersection.add(num);
                freq.put(num, freq.get(num) - 1);
            }
        }
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }
}
