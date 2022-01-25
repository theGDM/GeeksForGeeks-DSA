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
    public static Node reverse(Node head){
        Node prev = null, curr = head;
        while(curr != null){
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
    
    public static Node addOne(Node head) { 
        //code here.
        Node l1 = reverse(head);
        Node dummy = new Node(-1);
        Node dummyHead = dummy, dummyTail = dummy;
        int carry = 0;
        while(l1 != null || carry != 0){
            int d1 = l1 == null ? 0 : l1.data;
            if(dummyTail == dummy){//1st node then d2 = 1;
                Node temp = new Node((d1 + 1 + carry) % 10);
                carry = (d1 + 1 + carry) / 10;
                dummyTail.next = temp;
                dummyTail = temp;
            }else{
                Node temp = new Node((d1 + carry) % 10);
                carry = (d1 + carry) / 10;
                dummyTail.next = temp;
                dummyTail = temp;
            }
            if(l1 != null) l1 = l1.next;
        }
        return reverse(dummyHead.next);
    }
}
