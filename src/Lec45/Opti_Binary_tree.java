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
           if(root==null){
               return null;
           }
        DiaPair ldp=diameter(root.left);
        DiaPair rdp=diameter(root.right);
        DiaPair sdp=new DiaPair();
        sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
        int dia=ldp.ht+rdp.ht+2;
        sdp.d=Math.max(dia,Math.max(ldp.d,rdp.d));
                return sdp;
        }
   }
}
