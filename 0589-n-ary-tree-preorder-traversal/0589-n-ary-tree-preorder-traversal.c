/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     int numChildren;
 *     struct Node** children;
 * };
 */

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* preorder(struct Node* root, int* returnSize) {
    if (root == NULL) {
        *returnSize = 0;
        return NULL;
    }
    int maxNodes = 10000;
    int* result = (int*)malloc(sizeof(int) * maxNodes);
    struct Node** stack = (struct Node**)malloc(sizeof(struct Node*) * maxNodes);
    int top = 0;
    stack[top++] = root;
    *returnSize = 0;
    while (top > 0) {
        struct Node* node = stack[--top];
        result[(*returnSize)++] = node->val;
        for (int i = node->numChildren - 1; i >= 0; i--) {
            stack[top++] = node->children[i];
        }
    }
    free(stack);
    return result;
}
