package Lec10;

public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[]={1,5,5,6,2,2,5,6,2,6};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int item=arr[i];
            while(arr[j]>item){
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=item;
        }
    }
}
