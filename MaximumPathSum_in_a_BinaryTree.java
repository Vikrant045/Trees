public class MaximumPathSum_in_a_BinaryTree {
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
static int max = Integer.MIN_VALUE;
         public static int maxPath(Node root){
if(root == null){
    return 0;
}
int leftsum = maxPath(root.left);
int rightSum = maxPath(root.right);

int sum = (leftsum+rightSum)+root.data;
max = Math.max(max,sum);
return sum;

         }
    public static void main(String args[]){
Node root = new Node(-10);
root.left = new Node(9);
root.right = new Node(20);
root.right.left = new Node(15);
root.right.right = new Node(7);
maxPath(root);
System.out.println(max);
    }
    
}
