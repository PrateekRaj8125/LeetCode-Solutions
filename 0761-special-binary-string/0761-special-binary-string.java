class Solution {
    public String makeLargestSpecial(String s) {
        List<String> parts = new ArrayList<>();
        int count = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') 
                count++;
            else 
                count--;
            if (count == 0) {
                String inner = s.substring(start + 1, i);
                parts.add("1" + makeLargestSpecial(inner) + "0");
                start = i + 1;
            }
        }
        Collections.sort(parts, Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            result.append(part);
        }
        return result.toString();
    }
}