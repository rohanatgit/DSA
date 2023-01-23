package Lec30;

public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        int arr1[]={3,5,7,9,11};
        int[] arr2={1,2,3,4,6,7};
        int[] ans=mergeSortedArray(arr1,arr2);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] mergeSortedArray(int arr1[],int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int ans[] = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                ans[k] = arr1[i];
                k++;
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }

        }
        while (i < n) {
            ans[k] = arr1[i];
            k++;
            i++;
        }
        while (j < m) {
            ans[k] = arr2[j];
            k++;
            j++;
        }
    return ans;
    }
    public static void sum(int a ,int b){
        System.out.println(a+b);
    }
}
