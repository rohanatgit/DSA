package DAALAB;

public class Quick_Sort {
    public static void quickSort(int[] arr,int lo,int hi){
        if(lo>=hi){
            return ;
        }
        int idx=partition(arr,lo,hi);
        quickSort(arr,lo,idx-1);
        quickSort(arr,idx+1,hi);
    }
    public static void main(String[] args) {
        int arr[]={9,1,56,-9,56,5,2,68,5,62,3,2,1,3,7};;;;;
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int partition(int[] arr,int lo,int hi){
        int pivot=arr[hi];
        int idx=lo;
        for(int i=lo;i<hi;i++){
            if(arr[i]<=pivot){
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
