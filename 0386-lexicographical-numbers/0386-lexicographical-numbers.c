/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
void generateLexicalOrder(int current, int n, int* ans, int* index){
    if(current>n)
        return;
    ans[(*index)++]=current;
    for(int nd=0;nd<=9;nd++){
        int next=current*10+nd;
        if(next<=n)
            generateLexicalOrder(next, n, ans, index);
        else
            break;
    }
}
int* lexicalOrder(int n, int* returnSize) {
    int* ans=(int *)malloc(n*sizeof(int));
    *returnSize=n;
    int index=0;
    for(int start=1;start<=9;start++){
        if(start<=n)
            generateLexicalOrder(start,n,ans,&index);
        else
            break;
    }
    return ans;
}