/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node dummy = new Node(-1);
     Node dummyHead = dummy, dummyTail = dummy;
     while(head1 != null && head2 != null){
         if(head1.data < head2.data){
             dummyTail.next = head1;
             head1 = head1.next;
         }else{
             dummyTail.next = head2;
             head2 = head2.next;
         }
         dummyTail = dummyTail.next;
     }
     if(head1 != null) dummyTail.next = head1;
     else dummyTail.next = head2;
     return dummyHead.next;
   } 
}
