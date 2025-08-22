class Solution {
    public int lengthOfLongestSubstring(String s) {
        String sub = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = sub.indexOf(c);
            if (idx != -1) {
                sub = sub.substring(idx + 1);
            }
            sub += c;
            max = Math.max(max, sub.length());
        }
        return max;
    }
}
