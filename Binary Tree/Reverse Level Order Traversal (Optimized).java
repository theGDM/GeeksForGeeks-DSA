// Given a binary tree of size N, find its reverse level order traversal. ie- the traversal must begin from the last level.

// Example 1:

// Input :
//         1
//       /   \
//      3     2

// Output: 3 2 1
// Explanation:
// Traversing level 1 : 3 2
// Traversing level 0 : 1
// Example 2:

// Input :
//        10
//       /  \
//      20   30
//     / \ 
//    40  60

// Output: 40 60 20 30 10
// Explanation:
// Traversing level 2 : 40 60
// Traversing level 1 : 20 30
// Traversing level 0 : 10

class Tree{
    public ArrayList<Integer> reverseLevelOrder(Node node) {
        if(node == null){
            return new ArrayList<>();
        }
        
        Queue<Node> q = new ArrayDeque<>();
        Stack<Integer> stk = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(node);
    
        while(q.size() != 0){
            Node rnode = q.remove();
            stk.add(rnode.data);
                
            if(rnode.right != null){
                q.add(rnode.right);
            }
                
            if(rnode.left != null){
                q.add(rnode.left);
            }
        }
        
        while(stk.size() != 0){
           ans.add(stk.pop());
        }
        
        return ans;
    }
}      
