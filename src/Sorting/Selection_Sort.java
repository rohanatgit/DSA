package Sorting;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[]={1,3,4,6,9,4,7};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int [] arr){
        for(int i=0;i<arr.length;i++){
            int min_index=i;//index min
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=t;
        }
    }
}
