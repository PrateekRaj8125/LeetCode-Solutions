class Solution {
    public int reverse(int x) {
        long num=x,max=Integer.MAX_VALUE,rev=0;
        int flag=num<0?1:0;
        num=Math.abs(num);
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        if(rev>max)
            return 0;
        if(flag==1)
            rev*=-1;
        return (int)rev;
    }
}