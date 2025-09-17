/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k) {
    if (head == NULL || head->next == NULL || k == 0)
        return head;
    int l = 1;
    struct ListNode* temp = head;
    while (temp->next != NULL) {
        temp = temp->next;
        l++;
    }
    temp->next = head;
    k = k % l;
    int h = l - k;
    struct ListNode* newTail = head;
    for (int i = 1; i < h; i++) {
        newTail = newTail->next;
    }
    struct ListNode* newHead = newTail->next;
    newTail->next = NULL;
    return newHead;
}
