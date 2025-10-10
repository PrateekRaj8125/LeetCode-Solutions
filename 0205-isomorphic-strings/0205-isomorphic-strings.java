class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) 
            return false;
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        for (int i = 0; i < 256; ++i) {
            mapS[i] = -1;
            mapT[i] = -1;
        }
        for (int i = 0; i < s.length(); ++i) {
            int cs = s.charAt(i);
            int ct = t.charAt(i);
            if (mapS[cs] == -1 && mapT[ct] == -1) {
                mapS[cs] = ct;
                mapT[ct] = cs;
            } else if (mapS[cs] != ct || mapT[ct] != cs) {
                return false;
            }
        }
        return true;
    }
}
