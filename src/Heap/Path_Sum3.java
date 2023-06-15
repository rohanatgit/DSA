package Heap;

public class Path_Sum3 {
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
    class Solution{
        public int pathSum(TreeNode root,int targetSum){
            if(root==null){
                return 0;
            }
       int root_sum=countnumberofPath(root,targetSum);//10 ko include karke kitna path ayega
            int left=pathSum(root.left,targetSum);
            int right=pathSum(root.right,targetSum);
            return root_sum+left+right;
        }
        public int countnumberofPath(TreeNode root,int targetSum){
            if(root==null){
                return 0;
            }
            int ans=0;
            if(targetSum-root.val ==0){//leaf
                ans++;
            }
            ans=ans+countnumberofPath(root.left,targetSum-root.val);
            ans=ans+countnumberofPath(root.right,targetSum-root.val);
            return ans;
        }
    }
}
