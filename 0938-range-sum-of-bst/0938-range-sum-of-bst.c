/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int rangeSumBST(struct TreeNode* root, int low, int high) {
    int sum=0,num=root->val;
    if(num>=low&&num<=high)
        sum+=num;
    if(root->left)
        sum+=rangeSumBST(root->left,low,high);
    if(root->right)
        sum+=rangeSumBST(root->right,low,high);
    return sum;
}