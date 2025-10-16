/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
void helper(struct TreeNode* root, int* result, int* returnSize){
    if(root==NULL)
        return;
    result[(*returnSize)++]=root->val;
    helper(root->left,result,returnSize);
    helper(root->right,result,returnSize);
}
int* preorderTraversal(struct TreeNode* root, int* returnSize) {
    *returnSize=0;
    int* result=(int*)malloc(100*sizeof(int));
    if(result==NULL)
        return NULL;
    helper(root,result,returnSize);
    return result;
}