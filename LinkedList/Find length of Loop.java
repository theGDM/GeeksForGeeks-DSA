/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

//Function should return the length of the loop in LL.

class Solution{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head){
        //Add your code here.
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow) break; //loop detected
        }
        
        //loop not detected and it is sll, so return loop length 0
        if(fast == null || fast.next == null) return 0;
        
        int count = 1;
        Node curr = slow.next;
        while(curr != slow){
            ++count;
            curr = curr.next;
        }
        return count;
    }
}
