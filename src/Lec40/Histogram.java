package Lec40;

import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        int arr[]={2,3,5,4,6,1,7};
    }
 public static int Area(int arr[]){
        Stack<Integer> st=new Stack<Integer>();
        int ans=0;
        for(int i=0;i<arr.length;i++ ){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int r=i;
                int h=arr[st.pop()];
                if(st.isEmpty()){
                    ans=Math.max(ans,h*r);
                }
                else{

                }
            }
            st.push(i);
        }
    }
}
