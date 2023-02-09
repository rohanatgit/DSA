package Lec31;

public class Merge_Sort {
    public static void main(String[] args) {
      int arr1[]={7,3,2,15,7,1};

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
            ans[k]=arr2[k];
            k++;
            j++;
        }
    }
}
