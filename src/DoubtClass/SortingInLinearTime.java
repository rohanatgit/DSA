package DoubtClass;

import java.util.Scanner;

public class SortingInLinearTime {
    public static void sorting(int[] arr){
        int left=0;
        int right=arr.length-1;
        int mid=0;
        while(mid<=right){
            if(arr[mid]==2){
                int t=arr[right];
                arr[right]=arr[mid];
                arr[mid]=t;
                right--;
            }
            else if(arr[mid]==0){
                int t=arr[left];
                arr[left]=arr[mid];
                arr[mid]=t;
                left++;
            }
            else{
                mid++;
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();

       }
       sorting(arr);
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]+" ");
       }

    }
}
