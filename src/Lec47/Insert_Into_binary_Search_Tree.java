package Lec47;

public class Insert_Into_binary_Search_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
  class Solution{
        public TreeNode insertIntoBinaryTree(TreeNode root,int val){
            if(root==null){
                root= new TreeNode(val);
                return root;
            }
            if(root.val>val){
               root.left= insertIntoBinaryTree(root.left,val);
            }
            else{
                root.right=insertIntoBinaryTree(root.right,val);
            }
            return root;
        }


  }
}
