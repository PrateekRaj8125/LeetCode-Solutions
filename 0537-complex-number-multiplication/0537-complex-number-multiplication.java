class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] p1 = num1.split("\\+");
        String[] p2 = num2.split("\\+");
        int r1 = Integer.parseInt(p1[0]);
        int i1 = Integer.parseInt(p1[1].substring(0, p1[1].length() - 1));
        int r2 = Integer.parseInt(p2[0]);
        int i2 = Integer.parseInt(p2[1].substring(0, p2[1].length() - 1));
        int real = r1 * r2 - i1 * i2;
        int imag = r1 * i2 + r2 * i1;
        return real + "+" + imag + "i";
    }
}
