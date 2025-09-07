class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0;
        for(int i=0;i<columnTitle.length();i++){
            char ch=columnTitle.charAt(i);
            int av=(int)ch-64;
            sum=sum*26+av;
        }
        return sum;
    }
}