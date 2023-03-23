public class Delete_Leafs {
    static class Node {
        int data;
        Node left;
        Node right;
     
            public Node(int data){
             this.data = data;
             this.left = null;
             this.right = null;
            }
         }
         public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
    
        }

        public static Node deleteLeafs(Node root,int x){
            if(root == null){
                return null;
            }
           root.left =   deleteLeafs(root.left, x);
           root.right =   deleteLeafs(root.right, x);
          if(root.left== null && root.right== null&& root.data== x){
            return null;
        }
return root;
        }

    public static void main(String args[]){
        Node root = new Node (10);
        root.left = new Node(30);
      root.right = new Node (30);
   root.left.left = new Node(30);
  root.left.right = new Node(20);
  preorder(root);
  System.out.println();
  deleteLeafs(root, 30);
  preorder(root);

    }
    
}
