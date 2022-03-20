/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root){
      if(root == null){
          return new ArrayList<>();
      }
      
      ArrayList<Integer> ans = new ArrayList<>();
      Queue<Node> q = new ArrayDeque<>();
      q.add(root);
      
      while(q.size() != 0){
          int size = q.size();
          
          ans.add(q.peek().data);
          while(size-- > 0){
              Node rnode = q.remove();
              if(rnode.left != null){
                  q.add(rnode.left);
              }
              
              if(rnode.right != null){
                  q.add(rnode.right);
              }
          }
      }
      
      return ans;
    }
}
