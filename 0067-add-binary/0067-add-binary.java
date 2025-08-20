class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        String res = "";

        while (i >= 0 || j >= 0) {
            int d1 = (i >= 0) ? a.charAt(i) - '0' : 0;
            int d2 = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = d1 + d2 + carry;

            if (sum == 0) {
                res = "0" + res;
                carry = 0;
            }
            if (sum == 1) {
                res = "1" + res;
                carry = 0;
            }
            if (sum == 2) {
                res = "0" + res;
                carry = 1;
            }
            if (sum == 3) {
                res = "1" + res;
                carry = 1;
            }

            i--;
            j--;
        }

        if (carry == 1) {
            res = "1" + res;
        }

        return res;
    }
}
