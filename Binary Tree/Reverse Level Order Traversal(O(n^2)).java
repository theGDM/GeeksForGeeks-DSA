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
        Stack<String> stk = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        q.add(node);
        q.add(new Node(-1));
    
        while(q.size() != 0){
            Node rnode = q.remove();
            if(rnode.data != -1){
                str.append(rnode.data + " ");
                
                if(rnode.left != null){
                    q.add(rnode.left);
                }
                
                if(rnode.right != null){
                    q.add(rnode.right);
                }
            }else{
                stk.push(str.toString());
                str = new StringBuilder();;
                if(q.size() != 0){
                   q.add(new Node(-1));
                }
            }
        }
        
        while(stk.size() != 0){
           String s = stk.pop();
           
           int i = 0;
           for(int j = 0;j < s.length(); ++j){
               if(s.charAt(j) == ' '){
                   ans.add(Integer.parseInt(s.substring(i, j)));
                   i = j + 1;
               }
           }
        }
        
        return ans;
    }
}      
