package DAALAB;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,9,11};
        int item=9;
        System.out.println(binary_Search(arr,item));
    }
    public static int binary_Search(int[] arr,int item){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==item){
                return mid;
            }
            else if(arr[mid]>item){
                hi=mid-1;
            }
            else {
                lo=mid+1;
            }
        }
        return -1;
    }
}
