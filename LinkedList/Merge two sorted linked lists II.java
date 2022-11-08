class LinkedList{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node dTail = dummy, dHead = dummy;
        
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                dTail.next = head1;
                dTail = head1;
                head1 = head1.next;
            }else{
                dTail.next = head2;
                dTail = head2;
                head2 = head2.next;
            }
        }
        
        if(head1 == null) dTail.next = head2;
        else dTail.next = head1;
        
        return dHead.next;
    } 
}
