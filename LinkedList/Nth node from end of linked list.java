/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class GfG {
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n) {
       	Node fast = head;
       	Node slow = head;
       	//first moving fast node k node
       	while(fast != null && n != 0){
       	    fast = fast.next;
       	    --n;
       	}
       	
       	//if k didn't become 0, it means no of nodes in linkedlist is less than k
       	if(n > 0) return -1;
       	
        //now moving slow and fast with same pace
       	while(fast != null){
       	    fast = fast.next;
       	    slow = slow.next;
       	}
       	
       	return slow.data;
    }
}

