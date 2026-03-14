class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> soln=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isDigitDivisible(i))
                soln.add(i);
        }
        return soln;
    }
    private boolean isDigitDivisible(int num){
        int n=num,d=0;
        while(n>0){
            d=n%10;
            if(d==0||num%d!=0)
                return false;
            n/=10;
        }
        return true;
    }
}