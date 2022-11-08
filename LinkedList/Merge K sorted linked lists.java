//TC : O(N)
class Solution{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K){
        if(arr.length == 0) return null;
        return mergeHelper(0, arr.length - 1, arr);
    }
    
    Node mergeHelper(int left, int right, Node[] arr){
        if(left == right){
            return arr[left];
        }
        
        int mid = (left + right) / 2;
        
        Node leftMergeList = mergeHelper(left, mid, arr);
        Node rightMergedList = mergeHelper(mid + 1, right, arr);
        
        return mergeTwoSortedList(leftMergeList, rightMergedList);
    }
    
    Node mergeTwoSortedList(Node head1, Node head2) {
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
