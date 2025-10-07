class Solution {
    public int hammingWeight(int n) {
        String binary="";
        while(n>0){
            binary=(n%2)+binary;
            n/=2;
        }
        int ctr=0;
        for(int i=0;i<binary.length();i++)
            if(binary.charAt(i)=='1')
                ctr++;
        return ctr;
    }
}