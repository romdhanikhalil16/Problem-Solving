void display(struct Node *head)
{
   struct Node *node = head ;
   while(node != NULL){
       printf("%d ",node->data);
       node = node->next;
   }
}