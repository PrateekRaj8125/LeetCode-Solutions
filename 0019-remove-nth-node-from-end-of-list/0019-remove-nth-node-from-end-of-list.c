/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode* temp;
    if (head == NULL) 
        return NULL;
    int ctr=0;
    for(temp=head;temp!=NULL;temp=temp->next)
        ctr++;
    temp=head;
    if (n == ctr)
        return head->next;
    while(temp!=NULL && temp->next!=NULL){
        if((ctr-1)==n)
            temp->next=temp->next->next;
        temp=temp->next;
        ctr--;
    }
    return head;
}