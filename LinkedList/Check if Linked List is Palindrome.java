//TC : O(N)
class Solution{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        if(head == null || head.next == null){
            return true;
        }
        
        Node middle = getMiddle(head); //O(N)
        Node first = head;
        Node second = reverse(middle.next); //O(N / 2)
        middle.next = null;
        
        while(first != null && second != null){
            if(first.data != second.data){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        
        return true;
    }  
    
    public Node reverse(Node head){
        Node prev = null, curr = head;
        
        while(curr != null){
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        
        return prev;
    }
    
    public Node getMiddle(Node head){
        Node slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}

