/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
#include <stdlib.h>

struct QueueNode {
    struct TreeNode* node;
    struct QueueNode* next;
};

// Simple queue for BFS
void enqueue(struct QueueNode** front, struct QueueNode** rear, struct TreeNode* node) {
    struct QueueNode* newNode = (struct QueueNode*)malloc(sizeof(struct QueueNode));
    newNode->node = node;
    newNode->next = NULL;
    if (*rear) (*rear)->next = newNode;
    else *front = newNode;
    *rear = newNode;
}

struct TreeNode* dequeue(struct QueueNode** front, struct QueueNode** rear) {
    if (!*front) return NULL;
    struct QueueNode* temp = *front;
    struct TreeNode* node = temp->node;
    *front = temp->next;
    if (!*front) *rear = NULL;
    free(temp);
    return node;
}

int** levelOrder(struct TreeNode* root, int* returnSize, int** returnColumnSizes) {
    *returnSize = 0;
    if (!root) return NULL;

    int** result = (int**)malloc(sizeof(int*) * 2000);
    *returnColumnSizes = (int*)malloc(sizeof(int) * 2000);

    struct QueueNode* front = NULL;
    struct QueueNode* rear = NULL;
    enqueue(&front, &rear, root);

    while (front) {
        int levelSize = 0;
        struct QueueNode* temp = front;
        while (temp) {
            levelSize++;
            temp = temp->next;
        }

        (*returnColumnSizes)[*returnSize] = levelSize;
        result[*returnSize] = (int*)malloc(sizeof(int) * levelSize);

        for (int i = 0; i < levelSize; i++) {
            struct TreeNode* node = dequeue(&front, &rear);
            result[*returnSize][i] = node->val;
            if (node->left) enqueue(&front, &rear, node->left);
            if (node->right) enqueue(&front, &rear, node->right);
        }

        (*returnSize)++;
    }

    return result;
}
