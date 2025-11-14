class Solution {
    private static final boolean[] vowel = new boolean[128];
    static {
        vowel['a'] = vowel['e'] = vowel['i'] = vowel['o'] = vowel['u'] = true;
        vowel['A'] = vowel['E'] = vowel['I'] = vowel['O'] = vowel['U'] = true;
    }
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left = 0, right = ch.length - 1;
        while (left < right) {
            while (left < right && !vowel[ch[left]]) 
                left++;
            while (left < right && !vowel[ch[right]]) 
                right--;
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }
}
