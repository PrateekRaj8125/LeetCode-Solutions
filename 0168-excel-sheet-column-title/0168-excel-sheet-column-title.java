class Solution {
    public String convertToTitle(int columnNumber) {
        String str="";
        while(columnNumber>0){
            columnNumber--;
            str=(char)(65+columnNumber%26)+str;
            columnNumber/=26;
        }
        return str;
    }
}