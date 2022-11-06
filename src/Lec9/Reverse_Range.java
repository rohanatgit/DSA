package Lec9;

public class Reverse_Range {
    public static void main(String[] args) {
        int arr[]={1,23,65,16,5,1,6,1,-16,5,65,4};
        int i=2;
        int j=5;
      REverse(arr,i,j);
      for(int k=0;k<arr.length;k++){
          System.out.println(arr[k]+" ");
      }
    }
    public static void REverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }
}
