package Lec48;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Right_Side_View {
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
        static int max_depth;
        public List<Integer> rightSideView(TreeNode root) {
            max_depth=-1;
            List<Integer>ll=new ArrayList<>();
            View(root,ll,0);
            return ll;

        }
        public void View(TreeNode root,List<Integer>al,int curr_lev){
            if(root==null){
                return ;
            }
            if(curr_lev>max_depth){
                al.add(root.val);
                max_depth=curr_lev;
            }
            View(root.right,al,curr_lev);
            View(root.left,al,curr_lev);

        }
    }

}
