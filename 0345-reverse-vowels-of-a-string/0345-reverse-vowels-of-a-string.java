class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int left=0,right=ch.length-1;
        while(left<right){
            if(isVowel(ch[left])&&isVowel(ch[right])){
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
            else{
                if(!(isVowel(ch[left])))
                    left++;
                if(!(isVowel(ch[right])))
                    right--;
            }
        }
        String ans=new String(ch);
        return ans;
    }
    boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            return true;
        else
            return false;
    }
}