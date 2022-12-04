/* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class GfG{
    boolean isCircular(Node head){
    //0 or 1 node without loop
	if(head == null || head.next == null){
	    return false;
	}
	
	//self referential node, 1 node with loop
	if(head.next == head){
	    return true;
	}
	
	Node slow = head, fast = head;
	while(fast != null && fast.next != null){
	    slow = slow.next;
	    fast = fast.next.next;
	    
	    if(slow == head){
	        return true;
	    }
    }
    return false;
    }
}
