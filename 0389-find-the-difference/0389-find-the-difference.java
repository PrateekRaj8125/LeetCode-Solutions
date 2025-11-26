class Solution {
    public char findTheDifference(String s, String t) {
        char[] chs=s.toCharArray();
        char[] cht=t.toCharArray();
        Arrays.sort(chs);
        Arrays.sort(cht);
        for(int i=0;i<chs.length;i++){
            if(cht[i]!=chs[i])
                return cht[i];
        }
        if(cht.length>chs.length)
            return cht[cht.length-1];
        return ' ';
    }
}