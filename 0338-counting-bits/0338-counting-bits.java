class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            String binary=convertToBinary(i);
            ans[i]=countOnes(binary);
        }
        return ans;
    }
    String convertToBinary(int dec){
        String binary="";
        if(dec==0){
            return "000";
        }
        while(dec>0){
            binary=(dec%2)+binary;
            dec/=2;
        }
        return binary;
    }
    int countOnes(String binary){
        int ctr=0;
        for(int i=0;i<binary.length();i++)
            if(binary.charAt(i)=='1')
                ctr++;
        return ctr;
    }
}