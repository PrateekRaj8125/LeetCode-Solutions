class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxlen = 0;
        for (int i = 0; i < n; i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);
                if (isBalanced(map)) {
                    maxlen = Math.max(maxlen, j - i + 1);
                }
            }
        }
        return maxlen;
    }
    private boolean isBalanced(Map<Character, Integer> map) {
        int freq = -1;
        for (int count : map.values()) {
            if (freq == -1) freq = count;
            else if (freq != count) return false;
        }
        return true;
    }
}
