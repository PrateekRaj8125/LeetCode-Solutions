class Solution {
    public boolean hasAlternatingBits(int n) {
        String binary=findBinary(n);
        char prev=(char)binary.charAt(0);
        for(int i=1;i<binary.length();i++){
            char curr=binary.charAt(i);
            if(prev==curr)
                return false;
            prev=curr;
        }
        return true;
    }
    public String findBinary(int n) {
        StringBuilder binary = new StringBuilder();
        boolean started = false;

        for (int i = 31; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) == 1) {
                started = true;
                binary.append("1");
            } 
            else if (started)
                binary.append("0");
        }
        return binary.toString();
    }
}