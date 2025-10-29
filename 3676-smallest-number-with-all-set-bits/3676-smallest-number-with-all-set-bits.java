class Solution {
    public int smallestNumber(int n) {
        String binary=convertToBinary(n),newBinary="";
        for(int i=0;i<binary.length();i++){
            newBinary+="1";
        }
        return convertToDecimal(newBinary);
    }
    String convertToBinary(int n){
        String binary="";
        while(n>0){
            binary=(n%2)+binary;
            n/=2;
        }
        return binary;
    }
    int convertToDecimal(String binary){
        int dec=0;
        StringBuilder StringBinary = new StringBuilder(binary);
        String revBinary = StringBinary.reverse().toString();
        for(int i=0;i<revBinary.length();i++){
            int d=(int)revBinary.charAt(i)-'0';
            dec+=(d*Math.pow(2,i));
        }
        return dec;
    }
}