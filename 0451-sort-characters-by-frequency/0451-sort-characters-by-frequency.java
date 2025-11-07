class Solution {
    public String frequencySort(String s) {
        int freq[]=new int[128];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        String output="";
        for(int count=0;count<s.length();){
            char maxChar = 0;
            int maxFreq = 0;
            for (int c = 0; c < 128; c++) {
                if (freq[c] > maxFreq) {
                    maxFreq = freq[c];
                    maxChar = (char) c;
                }
            }
            for (int i = 0; i < maxFreq; i++) {
                output+=maxChar;
                count++;
            }
            freq[maxChar] = 0;
        }
        return output;
    }
}