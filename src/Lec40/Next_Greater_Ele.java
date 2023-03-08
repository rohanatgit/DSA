package Lec40;

import java.util.Stack;

public class Next_Greater_Ele {
    public static void main(String[] args) {
            int arr[]={11,3,23,9,15};
    }
    public static void NGE(int arr[]){
        int [] nge=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            //nge
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                //nge
                int ii=st.pop();
                nge[ii]=arr[i];
            }
            st.push(i);
        }
    }
}
