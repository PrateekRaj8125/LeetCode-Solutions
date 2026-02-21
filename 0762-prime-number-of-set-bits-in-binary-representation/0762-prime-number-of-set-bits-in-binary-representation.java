class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ctr=0;
        for(int i=left;i<=right;i++){
            int bitctr=0;
            int n=i;
            while(n>0){
                bitctr+=n&1;
                n>>=1;
            }
            if(isPrime(bitctr))
                ctr++;
        }
        return ctr;
    }
    private boolean isPrime(int n){
        if(n<=1)
            return false;
        if(n==2||n==3)
            return true;
        if (n%2==0)
            return false;
        for (int i=3;i*i<=n;i+=2)
            if(n%i==0)
                return false;
        return true;
    }
}