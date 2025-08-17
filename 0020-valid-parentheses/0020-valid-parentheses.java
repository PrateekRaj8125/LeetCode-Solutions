class Solution {
        public boolean isValid(String s) {
        char ch[]=s.toCharArray();
        char[] stack=new char[ch.length];
        int end=0;
        for(int i=0;i<ch.length;i++){
            switch(ch[i]){
                case '(':
                    stack[end++]='(';
                break;
                case '{':
                    stack[end++]='{';
                break;
                case '[':
                    stack[end++]='[';
                break;
                case ']':
                    if (end == 0 || stack[end-1] != '[')
                        return false;
                    end--;
                break;
                case '}':
                    if (end == 0 || stack[end-1] != '{')
                        return false;
                    end--;
                break;
                case ')':
                    if (end == 0 || stack[end-1] != '(')
                        return false;
                    end--;
                break;
            }
        }
        if(end==0)
            return true;
        else
            return false;
    }
}