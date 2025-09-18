/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* swapPairs(struct ListNode* head) {
    if (head == NULL || head->next == NULL) {
        return head;
    }
    struct ListNode* newHead = head->next;
    struct ListNode* temp1 = NULL;
    struct ListNode* temp2 = head;

    while (temp2!=NULL&&temp2->next != NULL) {
        struct ListNode* first = temp2;
        struct ListNode* second = temp2->next;
        first->next = second->next;
        second->next = first;
        if (temp1 != NULL) {
            temp1->next = second;
        }
        temp1=first;
        temp2=first->next;
    }
    return newHead;
}
