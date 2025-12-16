class Solution {
    public String[] findWords(String[] words) {
        String[] keyboard = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        List<String> result = new ArrayList<>();
        for (String word : words) {
            String lower = word.toLowerCase();
            int rowIndex = getRow(lower.charAt(0), keyboard);
            boolean valid = true;
            for (char c : lower.toCharArray()) {
                if (!keyboard[rowIndex].contains(String.valueOf(c))) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
    private int getRow(char c, String[] keyboard) {
        for (int i = 0; i < keyboard.length; i++) {
            if (keyboard[i].indexOf(c) != -1) {
                return i;
            }
        }
        return -1;
    }
}
