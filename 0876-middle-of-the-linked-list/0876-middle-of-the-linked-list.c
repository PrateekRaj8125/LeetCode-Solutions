/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode* t=head;
    int n=0,mid;
    while(t!=NULL){
        n++;
        t=t->next;
    }
    if(n%2==0)
        mid=n/2+1;
    else
        mid=(n+1)/2;
    for(int i=1;i<mid;i++)
        head=head->next;
    return head;
}