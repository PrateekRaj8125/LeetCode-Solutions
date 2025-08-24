class Solution {
    public String longestPalindrome(String s) {
        String maxstr = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub) && sub.length() > maxstr.length()) {
                    maxstr = sub;
                }
            }
        }
        return maxstr;
    }

    boolean isPalindrome(String sub) {
        int l = 0, r = sub.length() - 1;
        while (l < r) {
            if (sub.charAt(l) != sub.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }
}