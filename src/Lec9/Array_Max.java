package Lec9;

public class Array_Max {
    public static void main(String[] args) {
        int arr[]={10,-3,90,7,-9,79,-18,902};
        System.out.println(Minimum(arr));
    }
    public static int Minimum(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
