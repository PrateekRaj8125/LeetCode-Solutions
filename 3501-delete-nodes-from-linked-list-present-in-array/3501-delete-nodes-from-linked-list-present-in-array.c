#include <stdlib.h>

/* Definition for singly-linked list.
struct ListNode {
    int val;
    struct ListNode *next;
};
*/ 
int cmpInt(const void* a, const void* b) {
    int x = *(int*)a;
    int y = *(int*)b;
    return (x > y) - (x < y); 
}
int inNums(int* nums, int numsSize, int val) {
    return bsearch(&val, nums, numsSize, sizeof(int), cmpInt) != NULL;
}
struct ListNode* modifiedList(int* nums, int numsSize, struct ListNode* head) {
    qsort(nums, numsSize, sizeof(int), cmpInt);
    struct ListNode dummy;
    dummy.next = head;
    struct ListNode* prev = &dummy;
    struct ListNode* curr = head;
    while (curr != NULL) {
        if (inNums(nums, numsSize, curr->val)) {
            prev->next = curr->next;
            free(curr);
            curr = prev->next;
        } else {
            prev = curr;
            curr = curr->next;
        }
    }
    return dummy.next;
}
