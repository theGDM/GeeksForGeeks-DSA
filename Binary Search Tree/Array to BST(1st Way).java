class Solution{
    
    public class Node{
        int data;
        Node left;
        Node right;
        
        Node(){};
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    
    public Node construct (int[] nums, int lo, int hi){
        if(lo > hi) 
            return null;
        
        int mid = lo + (hi - lo) / 2;
        Node node = new Node(nums[mid]);
        node.left = construct(nums, lo , mid - 1);
        node.right = construct(nums, mid + 1, hi);
        return node;
    }
    
    public int idx = 0;
    public void preorder(Node root, int[] pre){
        if(root == null){
            return;
        }
        
        pre[idx] = root.data;
        ++idx;
        preorder(root.left, pre);
        preorder(root.right, pre);
    }
    
    public int[] sortedArrayToBST(int[] nums){
        Node root =  construct(nums, 0, nums.length - 1);
        int[] pre = new int[nums.length];
        preorder(root, pre);
        return pre;
    }
}
