class Solution {
    public int fib(int n) {
        int n1=0,n2=1,fn=0;
        if (n==0)
            return 0;
        if(n==1)
            return 1;
        for(int i=1;i<=n;i++)
        {
            fn=n1+n2;
            n1=n2;
            n2=fn;
        }
        return n1;
    }
}