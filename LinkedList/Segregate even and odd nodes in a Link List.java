/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution{
    Node divide(int N, Node head){
        // code here
        Node evenHead = new Node(-1);
        Node evenTail = evenHead;
        Node oddHead = new Node(-1);
        Node oddTail = oddHead;
        while(head != null){
            if(head.data % 2 == 0){
                evenTail.next = head;
                evenTail = head;
            }else{
                oddTail.next = head;
                oddTail = head;
            }
            head = head.next;
        }
        oddTail.next = null;
        evenTail.next = oddHead.next;
        return evenHead.next;
    }
}
