/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int minDepth(struct TreeNode* root) {
    if (root == NULL)
        return 0;
    if (root->left == NULL && root->right == NULL)
        return 1;
    int lft = minDepth(root->left);
    int rght = minDepth(root->right);
    if (root->left == NULL) 
        return 1 + rght;
    if (root->right == NULL) 
        return 1 + lft;
    return 1 + (lft < rght ? lft : rght);
}