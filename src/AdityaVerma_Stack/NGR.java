package AdityaVerma_Stack;

import java.util.Stack;

public class NGR {
    public static void main(String[] args) {
        int arr[]={1,3,2,4};
        nextGreaterEle(arr);
    }
    public static void  nextGreaterEle(int[] nums){
         Stack<Integer> st=new Stack<>();
         int ans[]=new int[nums.length];
         for(int i=nums.length-1;i>=0;i--){
             while(st.size()>0 && st.peek()<nums[i]){
                 st.pop();
             }
             if(st.size()>0){
                 ans[i]=st.peek();
             }
             else{
                 ans[i]=-1;
             }
             st.push(nums[i]);
         }
         for(int i=0;i<ans.length;i++){
             System.out.print(ans[i]);
         }
    }
}
