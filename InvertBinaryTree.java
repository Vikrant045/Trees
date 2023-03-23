public class InvertBinaryTree {
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

         public static Node invert(Node root){
            if(root==  null){
                return  root;
            }


                Node left =  invert(root.left);
                Node right = invert(root.right);
            root.left = right;
             root.right = left;
           
            return root;
         }
         public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");

            preorder(root.left);
            preorder(root.right);
    
        }

         public static void main(String args[]){
            Node root = new Node (10);
             root.left = new Node(30);
           root.right = new Node (30);
        root.left.left = new Node(30);
       root.left.right = new Node(20);
       
       preorder(root);
      
       System.out.println( invert(root).data);
       preorder(root);
     
         }
         
    }

 

