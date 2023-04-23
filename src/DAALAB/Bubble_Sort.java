package DAALAB;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr={1,3,2,7,9,4};
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int[] arr){
        //Pass
        for(int pass=1;pass<arr.length;pass++){
            for(int i=0;i<arr.length-pass;i++){
                if(arr[i]>arr[i+1]){
                    int t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                }
            }
        }
    }
}
