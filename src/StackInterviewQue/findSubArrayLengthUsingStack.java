package StackInterviewQue;

import java.util.Stack;

public class findSubArrayLengthUsingStack {
    public static int findSubArrayLengthUsing2(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int min = arr.length;
        int max = 0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                min=Math.min(min,st.pop());
            }
            st.push(i);
        }
        st.clear();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                max=Math.max(max,st.pop());
            }
            st.push(i);
        }
        return max-min+1;
    }

    public static void main(String[] args) {
        int arr[]={0,2,5,4,9,6,12};
        System.out.println(findSubArrayLengthUsing2(arr));
    }
}