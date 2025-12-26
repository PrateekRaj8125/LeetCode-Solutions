class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i += 2 * k) {
            int firstEnd = Math.min(i + k, n);
            int secondEnd = Math.min(i + 2 * k, n);
            StringBuilder part = new StringBuilder(s.substring(i, firstEnd));
            result.append(part.reverse());
            if (firstEnd < secondEnd) {
                result.append(s.substring(firstEnd, secondEnd));
            }
        }
        return result.toString();
    }
}
