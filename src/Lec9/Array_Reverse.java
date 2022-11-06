package Lec9;

public class Array_Reverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,9,5,};
        print_reverse(arr);
    }
    public static void print_reverse(int arr[]){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
