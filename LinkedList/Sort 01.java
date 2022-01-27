/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        ListNode zeroHead = new ListNode(-1);
        ListNode zeroTail = zeroHead;
        ListNode oneHead = new ListNode(-1);
        ListNode oneTail = oneHead;
        while(A != null){
            if(A.val == 0){
                zeroTail.next = A;
                zeroTail = A;
            }else{
                oneTail.next = A;
                oneTail = A;
            }
            A = A.next;
        }
        oneTail.next = null;
        zeroTail.next = oneHead.next;
        return zeroHead.next;
    }
}
