package Lec46;

public class LCA2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
  class Solution{
        public TreeNode lca(TreeNode root,TreeNode p,TreeNode q){
            if(root==null) {
                return null;
            }
            if(root==p || root==q){
                return root;
            }
            TreeNode left=lca(root.left,p,q);
            TreeNode right=lca(root.right,p,q);
            if(left!=null && right!=null){
                return root;
            }
            if(left!=null){
                return right;
            }
            else{
                return left;
            }
        }
    }
}

