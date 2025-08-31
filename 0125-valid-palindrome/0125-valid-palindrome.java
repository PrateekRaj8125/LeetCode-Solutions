class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        s=s.toLowerCase();
        String sen="", rsen="";
        for(int i=0;i<s.length();i++){
            int av=(int)s.charAt(i);
            if(av>=97&&av<=122||(av>=48&&av<=57))
                sen+=(char)av;
        }
        for(int i=sen.length()-1;i>=0;i--){
            char ch=sen.charAt(i);
            rsen+=ch;
        }
        if(rsen.equals(sen))
            return true;
        else
            return false;
    }
}