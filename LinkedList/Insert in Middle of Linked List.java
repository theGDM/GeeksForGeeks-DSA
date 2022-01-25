/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public Node getMiddleNode(Node head){
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast == null){ //even nodes
            return prev;
        }else{ //odd nodes
            return slow;
        }
    }
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node mid = getMiddleNode(head); //getting middle node
        Node temp = new Node(data); //creating new node
        temp.next = mid.next;
        mid.next = temp;
        return head;
    }
}
