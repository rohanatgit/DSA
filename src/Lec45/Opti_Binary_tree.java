package Lec45;

public class Opti_Binary_tree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
   public class DiaPair{
        int d=0;
        int ht=-1;
   }
   class Solution{
        public int diameterofBT(TreeNode root){
            return diameter(root).d;
        }
        public DiaPair diameter(TreeNode root){

        }
   }
}
