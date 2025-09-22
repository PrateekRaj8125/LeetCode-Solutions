/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* spiralOrder(int** matrix, int matrixSize, int* matrixColSize, int* returnSize) {
    *returnSize = matrixSize * (*matrixColSize);
    int *answer = (int*)malloc((*returnSize) * sizeof(int));
    if (!answer) 
        return NULL;
    int top = 0, bottom = matrixSize - 1;
    int left = 0, right = (*matrixColSize) - 1;
    int idx = 0;
    while (top <= bottom && left <= right) {
        for (int j = left; j <= right; j++)
            answer[idx++] = matrix[top][j];
        top++;
        for (int i = top; i <= bottom; i++)
            answer[idx++] = matrix[i][right];
        right--;
        if (top <= bottom) {
            for (int j = right; j >= left; j--)
                answer[idx++] = matrix[bottom][j];
            bottom--;
        }
        if (left <= right) {
            for (int i = bottom; i >= top; i--)
                answer[idx++] = matrix[i][left];
            left++;
        }
    }
    return answer;
}
