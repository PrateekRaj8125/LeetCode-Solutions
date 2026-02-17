class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : s.toCharArray())
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        int sum = 0;
        boolean hasOdd = false;
        for (int count : charMap.values()) {
            sum += (count / 2) * 2;
            if (count % 2 == 1)
                hasOdd = true;
        }
        if (hasOdd) 
            sum += 1;
        return sum;
    }
}
