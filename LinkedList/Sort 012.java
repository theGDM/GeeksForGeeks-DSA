/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head){
        Node zeroHead = new Node(-1);
        Node zeroTail = zeroHead;
        Node oneHead = new Node(-1);
        Node oneTail = oneHead;
        Node twoHead = new Node(-1);
        Node twoTail = twoHead;
        while(head != null){
            if(head.data == 0){
                zeroTail.next = head;
                zeroTail = head;
            }else if(head.data == 1){
                oneTail.next = head;
                oneTail = head;
            }else{
                twoTail.next = head;
                twoTail = head;
            }
            head = head.next;
        }
        twoTail.next = null;
        oneTail.next = twoHead.next;
        zeroTail.next = oneHead.next;
        return zeroHead.next;
    }
}
