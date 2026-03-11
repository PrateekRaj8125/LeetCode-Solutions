class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        StringBuilder str=new StringBuilder();
        while(n>0){
            str.append(n&1);
            n>>=1;
        }
        String finalStr=str.reverse().toString();
        StringBuilder newStr=new StringBuilder();
        for (char ch : finalStr.toCharArray()){
            if (ch == '1')
                newStr.append('0');
            else
                newStr.append('1');
        }
        return convertToDecimal(newStr.toString());
    }
    private int convertToDecimal(String binary){
        int num=0;
        for(int i=0;i<binary.length();i++) {
            int d = binary.charAt(i)-'0';
            num=num*2+d;
        }
        return num;
    }
}