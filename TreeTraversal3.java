//find TreeTraversal preorder,inorder,postorder for given tree    
   //      1
    //     / \
    //    2   3
    //   /\   /\
    //  4  5  6 7
    //    /     /\
    //   8     9 10 
import java.util.*;
class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode (int value){
        this.value=value;
        left=right=null;
    }
}
public class TreeTraversal3{
    
    public static void preorder(TreeNode node){
        if(node==null)
        return;
        System.out.print(node.value+" ");//root
        preorder(node.left);//left
        preorder(node.right);//right
    }
    public  static void inorder(TreeNode node){
        if(node==null)
        return;
        inorder(node.left);
        System.out.print(node.value+" ");
        inorder(node.right);
    }
    public  static void postorder(TreeNode node){
        if(node==null)
        return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value+" ");
     }
     public  void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(8);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.right.right.left=new TreeNode(9);
        root.right.right.right=new TreeNode(10);
        TreeTraversal3 tree=new TreeTraversal3();
        System.out.print("Preorder traversal:");
        tree.preorder(root);
        System.out.print("inorder traversal:");
        tree.inorder(root);
        System.out.print("Postorder traversal:");
        tree.postorder(root);
    }
    }