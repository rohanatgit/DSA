package Lec46;

public class Symmetric_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean isSymmetric(TreeNode root) {

        }
        public boolean Mirror(TreeNode root1,TreeNode root2){
            if(root1==null && root2==null){
                return true;
            }
            else if(root1==null || root2==null){
                return false;
            }

    }
}