package Lec31;

public class QuickSort {
    public static void main(String[] args) {
            int arr[]={9,1,3,4,67,8,8,9,90};
       int idx=index(arr,0,arr.length-1);
        System.out.print(idx);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int index(int[] arr,int lo,int hi){
        int last_element=arr[hi];
        int idx=lo;
        for(int i=lo;i<hi;i++){
            if(arr[i]<=last_element){
                //i ,idx
                int t=arr[i];
                arr[i]=arr[idx];
                arr[idx]=t;
                idx++;
            }
        }
        //idx hi
        int t=arr[idx];
        arr[idx]=arr[hi];
        arr[hi]=t;
        return idx;
    }
}
