class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        if(n==0)
            return 0;
        if(n==1||n==2||n==3)
            return 1;
        int type=1;
        Arrays.sort(candyType);
        for(int i=1;i<n;i++){
            if(candyType[i]!=candyType[i-1])
                type++;
        }
        return Math.min(type,n/2);
    }
}