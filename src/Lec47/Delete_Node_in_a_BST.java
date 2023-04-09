package Lec47;

public class Delete_Node_in_a_BST {
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
    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {



            if(root.val<key){
                root.right=deleteNode(root.right,key);
            }
            else if(root.val>key){
                root.left=deleteNode(root.left,key);
            }
            //element mil gaya isko delete karna hai
            else{

            }
        }
    }
}
