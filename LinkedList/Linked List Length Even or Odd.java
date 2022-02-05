class GFG{
    String checkEvenOrOdd(Node head){
        Node fast = head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null){
            return "even";
        }else{
            return "odd";
        }
    }
    
	int isLengthEvenorOdd(Node head1){
	    String res = checkEvenOrOdd(head1);
	    if(res == "even"){
	        return 0;
	    }else{
	        return 1;
	    }
	}
}
