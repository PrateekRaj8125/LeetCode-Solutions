class Solution {
    public int mirrorDistance(int n) {
        String num=Integer.toString(n);
        num=new StringBuilder(num).reverse().toString();
        return Math.abs(n-(Integer.parseInt(num)));
    }
}