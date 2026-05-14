/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int getDecimalValue(struct ListNode* head) {
    if(head==NULL)
        return 0;
    int dctr=-1,decimal=0;
    struct ListNode *t=(struct ListNode*)calloc(1,sizeof(struct ListNode));
    for(t=head;t!=NULL;t=t->next)
        dctr++;
    for(t=head;t!=NULL;t=t->next)
        decimal+=t->val*pow(2,dctr--);
    return decimal;
}