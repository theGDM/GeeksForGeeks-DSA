//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }
class Solution{
    void leftMostNodes(Node node, ArrayList<Integer> lmn){
        if(node == null){
            return;
        }
        
        if(node.left == null && node.right == null){
            return;
        }
        
        //preorder me kaam
        lmn.add(node.data);
        
        //if current node's left node is null, then only
        //call to current node's right node.
        if(node.left != null){
            leftMostNodes(node.left, lmn);
        }else{
            leftMostNodes(node.right, lmn);
        }
        
    }
    
    void reversedRightMostNodes(Node node, ArrayList<Integer> rmn){
        if(node == null){
            return;
        }
        
        if(node.left == null && node.right == null){
            return;
        }
        
        //if current node's right node is null, then only
        //call to current node's left node.
        if(node.right != null){
            reversedRightMostNodes(node.right, rmn);
        }else{
            reversedRightMostNodes(node.left, rmn);
        }
        
        //postorder me kaam
        rmn.add(node.data);
    }
    
    void leafNodes(Node node, ArrayList<Integer> ln){
        if(node == null){
            return;
        }
        
        if(node.left == null && node.right == null){
            ln.add(node.data);
            return;
        }
        
        leafNodes(node.left, ln);
        leafNodes(node.right, ln);
    }
    
	ArrayList<Integer> boundary(Node node){
	    ArrayList<Integer> res = new ArrayList<>();
	    if(node == null){ //empty binary tree
	        return res;
	    }
	    
	    res.add(node.data);
	    if(node.left == null && node.right == null){ //leaf node
	        return res;
	    }
	    
	    //left most nodes without node and leaf
	    ArrayList<Integer> lmn = new ArrayList<>();
	    leftMostNodes(node.left, lmn);
	    
	    //leaf nodes
	    ArrayList<Integer> ln = new ArrayList<>();
	    leafNodes(node, ln);
	    
	    //right most nodes without node and leaf(reverse)
	    ArrayList<Integer> rmn = new ArrayList<>();
	    reversedRightMostNodes(node.right, rmn);
	    
	    res.addAll(lmn);
	    res.addAll(ln);
	    res.addAll(rmn);
	    return res;
	}
}
