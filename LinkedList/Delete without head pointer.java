class Solution{
    void deleteNode(Node del){
         if(del.next != null){//not tail node
             if(del.next.next == null){
                 del.data = del.next.data;
                 del.next = null;
             }else{
                 del.data = del.next.data;
                 del.next = del.next.next;
             }
         }else{//tail node;
             Node prev = del;
             while(prev.next != del){
                 prev = prev.next;
             }
             prev.next = null;
         }
    }
}
