class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int minlen=strs[0].length();
        for(int i=0;i<strs.length;i++){
            minlen=Math.min(minlen,strs[i].length());
        }
        for (int j = 0; j < minlen; j++) {
            char ch = strs[0].charAt(j);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(j) != ch) {
                    return prefix;
                }
            }
            prefix += ch;
        }
        return prefix;
    }
}
