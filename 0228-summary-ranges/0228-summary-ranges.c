/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
char** summaryRanges(int* nums, int numsSize, int* returnSize) {
    *returnSize=0;
    if(numsSize==0)
        return NULL;
    char **output=(char **)malloc(numsSize*sizeof(char *));
    int i = 0;

    while (i < numsSize) {
        int start = nums[i];
        int end = start;
        while (i + 1 < numsSize && nums[i + 1] == nums[i] + 1) {
            i++;
            end = nums[i];
        }
            output[*returnSize] = (char *)malloc(25 * sizeof(char));
        if (start == end)
            sprintf(output[*returnSize], "%d", start);
        else
            sprintf(output[*returnSize], "%d->%d", start, end);

        (*returnSize)++;
        i++;
    }
    return output;
}