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
void inorderHelper(struct TreeNode* root, int* arr, int* idx) {
    if (root == NULL) 
        return;
    inorderHelper(root->left, arr, idx);
    arr[(*idx)++] = root->val;
    inorderHelper(root->right, arr, idx);
}
int* inorderTraversal(struct TreeNode* root, int* returnSize) {
    *returnSize = 0;
    if (root == NULL) 
        return NULL;
    int* arr = (int*)malloc(sizeof(int) * 100);
    int idx = 0;
    inorderHelper(root, arr, &idx);
    *returnSize = idx;
    return arr;
}
