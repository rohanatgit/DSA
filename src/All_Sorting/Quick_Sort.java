package All_Sorting;

public class Quick_Sort {
    public static void quick_Sort(int arr[],int lo,int hi){
        if(lo>=hi){
            return ;
        }
        int idx=partition(arr,lo,hi);
        quick_Sort(arr,lo,idx-1);
        quick_Sort(arr,idx+1,hi);

    }
    public static void main(String[] args) {
        int arr[]={2,1,4,5,3};
        quick_Sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int partition(int arr[],int lo,int hi){
        int pivot=arr[hi];
        int idx=lo;
        for(int i=lo;i<hi;i++){
            if(arr[i]<=pivot){
                //i,idx
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=arr[i];
                idx++;
            }
        }
        int temp=arr[idx];
        arr[idx]=arr[hi];
        arr[hi]=temp;
        return  idx;
    }
}
