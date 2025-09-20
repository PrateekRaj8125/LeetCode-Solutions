class Solution {
    public String multiply(String num1, String num2) {
        boolean neg = false;                                                
        if (num1.length() > 0 && num1.charAt(0) == '-') { 
            neg = !neg; 
            num1 = num1.substring(1); 
        }  
        if (num2.length() > 0 && num2.charAt(0) == '-') { 
            neg = !neg; 
            num2 = num2.substring(1); 
        }  
        if (num1.equals("0") || num2.equals("0")) 
            return "0";               
        int m = num1.length(), n = num2.length();
        int[] prod = new int[m + n];                                        
        for (int i = m - 1; i >= 0; i--) {                                  
            int a = num1.charAt(i) - '0';                                 
            for (int j = n - 1; j >= 0; j--) {                            
                int b = num2.charAt(j) - '0';                              
                int p = a * b + prod[i + j + 1];                           
                prod[i + j + 1] = p % 10;                                 
                prod[i + j] += p / 10;                                     
            }
        }
        StringBuilder sb = new StringBuilder();                             
        int k = (prod[0] == 0) ? 1 : 0;                                   
        for (; k < prod.length; k++) 
            sb.append(prod[k]);              
        if (neg) sb.insert(0, '-');                                       
        return sb.toString();                                              
    }
}
