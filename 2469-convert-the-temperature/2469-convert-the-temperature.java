class Solution {
    public double[] convertTemperature(double celsius) {
        double[] converted_temp=new double[2];
        converted_temp[0]=celsius+273.15;
        converted_temp[1]=celsius*1.80+32.00;
        return converted_temp;
    }
}