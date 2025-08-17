class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int dn=x,rn=0;
        while(dn>0){
            rn=(rn*10)+(dn%10);
            dn/=10;
        }
        return rn==x;
    }
}