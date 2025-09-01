/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int maxDepth(struct TreeNode* root) {
    if(root==NULL)
        return 0;
    int lft=maxDepth(root->left);
    int rght=maxDepth(root->right);
    return 1+(lft>rght?lft:rght);
}