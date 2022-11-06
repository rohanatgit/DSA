package Lec9;

public class Rorate_Array {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int k=3;
        RotateArray(arr,k);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void RotateArray(int arr[],int k){
        k=k%arr.length;

        for(int h=1;h<=k;h++) {
            int temp=arr[arr.length-1];
            for (int i = arr.length - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = temp;
        }

    }
}
