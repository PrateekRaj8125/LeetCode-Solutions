/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int maxDepth;
int result;
void dfs(struct TreeNode* root, int depth) {
    if (root == NULL) 
        return;
    if (depth > maxDepth) {
        maxDepth = depth;
        result = root->val;
    }
    dfs(root->left, depth + 1);
    dfs(root->right, depth + 1);
}
int findBottomLeftValue(struct TreeNode* root) {
    maxDepth = -1;
    result = root->val;
    dfs(root, 0);
    return result;
}