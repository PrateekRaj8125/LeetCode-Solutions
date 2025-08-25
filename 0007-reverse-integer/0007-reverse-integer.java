class Solution {
    public int reverse(int x) {
        int flag=1;
        if(x<0){
            flag=-1;
            x=Math.abs(x);
        }
        int dn=0;
        while(x>0){
            if (dn > (Integer.MAX_VALUE - (x % 10)) / 10) {
                return 0;
            }
            dn=dn*10+(x%10);
            x/=10;
        }
        return (flag*dn);
    }
}