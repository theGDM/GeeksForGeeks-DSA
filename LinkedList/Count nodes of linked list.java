class Solution{
    //Function to count nodes of a linked list.
    public static int getCount(Node head){
        int count = 0;
        while(head != null){
            ++count;
            head = head.next;
        }
        return count;
    }
}
