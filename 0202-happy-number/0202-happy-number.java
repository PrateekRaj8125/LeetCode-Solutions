class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7) 
            return true;
        else if(n<10)
            return false;
            int dn=n,di,sum=0;
            while(dn>0){
                di=dn%10;
                sum+=(di*di);
                dn/=10;
            }
            return isHappy(sum);
    }
}