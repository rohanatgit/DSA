package DAALAB;

public class Merge_Sort {
    public static void main(String[] args) {
        int arr[]={7,3,2,15,7,1};
        int[] ans=mergeSort(arr,0,arr.length-1);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] mergeSort(int arr[],int lo,int hi){
        if(lo==hi){
            int [] a=new int[1];
            a[0]=arr[lo];
            return a;
        }
        int mid=(lo+hi)/2;
        int [] fs=mergeSort(arr,lo,mid);
        int [] ss=mergeSort(arr,mid+1,hi);
        return Merge_Ywo_Sorted_Array(fs,ss);
    }
    public static int[] Merge_Ywo_Sorted_Array(int[] arr1,int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int ans[]=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            }
            else{
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while(j<m){
            ans[k]=arr2[j];
            k++;
            j++;
        }
        return ans;
    }
}
