/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    if(list1==NULL)
        return list2;
    if(list2==NULL)
        return list1;
    struct ListNode *head, *temp;
    if(list1->val<list2->val){
        head=list1;
        list1=list1->next;
    }
    else{
        head=list2;
        list2=list2->next;
    }
    temp=head;
    while(list1!=NULL&&list2!=NULL){
        if(list1->val<=list2->val){
            temp->next=list1;
            list1=list1->next;
        }
        else{
            temp->next=list2;
            list2=list2->next;
        }
        temp=temp->next;
    }
    temp->next=(list1!=NULL)?list1:list2;
    return head;
}