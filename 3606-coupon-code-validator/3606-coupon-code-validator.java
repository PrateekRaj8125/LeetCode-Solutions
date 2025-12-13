class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<Integer> validIndices = new ArrayList<>();
        for (int i = 0; i < code.length; i++) {
            if (isActive[i] && validateCode(code[i]) && validateBusinessLine(businessLine[i])) {
                validIndices.add(i);
            }
        }
        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 0);
        priority.put("grocery", 1);
        priority.put("pharmacy", 2);
        priority.put("restaurant", 3);
        validIndices.sort((i, j) -> {
            int p1 = priority.get(businessLine[i]);
            int p2 = priority.get(businessLine[j]);
            if (p1 != p2) {
                return p1 - p2;
            }
            return code[i].compareTo(code[j]);
        });
        List<String> res = new ArrayList<>();
        for (int idx : validIndices) {
            res.add(code[idx]);
        }
        return res;
    }
    boolean validateCode(String code) {
        if (code.length() == 0) return false;
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }
        return true;
    }
    boolean validateBusinessLine(String line) {
        return line.equals("electronics")||line.equals("grocery")||line.equals("pharmacy")||line.equals("restaurant");
    }
}
