//TC : O(nlog(n))
class Solution{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head){
        if(head == null || head.next == null){ //base case
            return head;
        }
        
        Node mid = getMiddle(head); //get middle
        Node first = head; //first part
        Node second = mid.next; //second part
        mid.next = null;
        
        Node left = mergeSort(first);
        Node right = mergeSort(second);
        
        return sortedMerge(left, right);
    }
    
    public static Node getMiddle(Node head){
        Node slow = head, fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public static Node sortedMerge(Node head1, Node head2) {
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



