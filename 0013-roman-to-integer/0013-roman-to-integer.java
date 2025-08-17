class Solution {
    public int romanToInt(String s) {
        int l=s.length();
        char roman[]=s.toCharArray();
        int num=0;
        for(int i=0;i<l-1;i++){
            roman[i]=Character.toUpperCase(roman[i]);
            if(roman[i]=='I'){
                if(roman[i+1]=='V'||roman[i+1]=='X'||roman[i+1]=='L'||roman[i+1]=='C'||roman[i+1]=='D'||roman[i+1]=='M')
                    num-=1;
                else
                    num+=1;
            }
            if(roman[i]=='X'){
                if(roman[i+1]=='L'||roman[i+1]=='C'||roman[i+1]=='D'||roman[i+1]=='M')
                    num-=10;
                else
                    num+=10;
            }
            if(roman[i]=='C'){
                if(roman[i+1]=='D'||roman[i+1]=='M')
                    num-=100;
                else
                    num+=100;
            }
            if(roman[i]=='V')
                num+=5;
            if(roman[i]=='L')
                num+=50;
            if(roman[i]=='D')
                num+=500;
            if(roman[i]=='M')
                num+=1000;
        }
        if(roman[l-1]=='V')
            num+=5;
        if(roman[l-1]=='L')
            num+=50;
        if(roman[l-1]=='D')
            num+=500;
        if(roman[l-1]=='M')
            num+=1000;
        if(roman[l-1]=='C')
            num+=100;
        if(roman[l-1]=='X')
            num+=10;
        if(roman[l-1]=='I')
            num+=1;
        return num;
    }
}