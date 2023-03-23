public class Uni_valuedOrNot{

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

    public static void inorder(Node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    public static boolean  uniValued(Node root){
        if(root== null){
            return true;
        }
        if(root.left != null && root.data != root.left.data){
            return false;
            
        }
        if(root.right !=  null && root.data != root.right.data ){
            return false;
        }
        uniValued(root.left);
        uniValued(root.right);
        return true;
    }
    public static void main(String args[]){

       Node root = new Node (10);
        root.left = new Node(1);
      root.right = new Node (1);
   root.left.left = new Node(1);
  root.left.right = new Node(1);
  root.right.left = new Node(1);
  root.right.right= new Node(1);
inorder(root);
if(uniValued(root)){
    System.out.println("Yes Tree is univalued");
}
else{
    System.out.println(" No tree is not univalued");
}
    }
}