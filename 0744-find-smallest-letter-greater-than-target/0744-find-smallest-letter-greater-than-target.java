class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int[] av=new int[letters.length];
        for(int i=0;i<letters.length;i++)
            av[i]=(int)letters[i];
        Arrays.sort(av);
        int t=(int) target;
        for(int i=0;i<av.length;i++){
            if(av[i]>t)
                return (char)av[i];
        }
        return letters[0];
    }
}