class Solution {
    public String toLowerCase(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
                int av=(int)s.charAt(i);
                if(av>64&&av<91)
                    av+=32;
                res+=((char)av);
        }
        return res;
    }
}