package All_Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={2,1,3,1,4};
        int i=0;
        int j=arr.length-1;
    }
    public static int[] mergeSort(int arr[],int i,int j){
        int mid=(i+j)/2;
        if(i==j){

        }
        int arr1[]=mergeSort(arr,i,mid);
        int arr2[]=mergeSort(arr,mid+1,j);
        return mergetwoSortedArray(arr1,arr2);
    }
    public static int[] mergetwoSortedArray(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        int k=0;
        int n= arr1.length;
        int m=arr2.length;
        int ans[]=new int[arr1.length+arr2.length];
        while (i<n && j<m){
            if(arr1[i]<=arr2[j]){
                ans[k]=arr1[i];
                i++;
                k++;
            }
            else{
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            ans[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
