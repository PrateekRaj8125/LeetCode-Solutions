/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int res=0;
int backtrack(struct TreeNode* temp,int num){
    if(temp==NULL)
    return 0;
    if(temp->left==NULL&&temp->right==NULL){
        return (num<<1)|(temp->val);
    }
    return backtrack(temp->left,(num<<1)|(temp->val))+backtrack(temp->right,(num<<1)|(temp->val));

}
int sumRootToLeaf(struct TreeNode* root) {
    return backtrack(root,0);
}