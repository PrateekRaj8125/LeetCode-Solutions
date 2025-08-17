class Solution {
    public boolean isPowerOfFour(int n) {
        double power=Math.log(n)/Math.log(4);
        int p=(int)power;
        power-=p;
        if(power!=0.0)
            return false;
        else
            return true;
    }
}