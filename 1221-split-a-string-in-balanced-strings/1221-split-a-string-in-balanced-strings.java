class Solution {
    public int balancedStringSplit(String s) {
        int balance=0,count=0;
        for(char ch:s.toCharArray()){
            if(ch=='L')
                balance++;
            if(ch=='R')
                balance--;
            if(balance==0)
                count++;
        }
        return count;
    }
}