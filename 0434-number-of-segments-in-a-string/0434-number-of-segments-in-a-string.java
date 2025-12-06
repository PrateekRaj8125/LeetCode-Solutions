class Solution {
    public int countSegments(String s) {
        int count = 0;
        boolean flag = false;
        for (char c : s.toCharArray()) {
            if (c != ' ' && !flag) {
                count++;
                flag = true;
            } else if (c == ' ') {
                flag = false;
            }
        }
        return count;
    }
}