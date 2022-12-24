package DoubtClass;

import java.util.Arrays;
import java.util.Scanner;

public class Target_Sum {
    public static void targetSum(int arr[],int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                System.out.println(arr[i] + "and" + arr[j]);
                i++;
                j--;
            } else if (arr[i] + arr[j]>target) {
                 j--;
            }
            else{
                i++;
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
        int target=sc.nextInt();
        Arrays.sort(arr);
    targetSum(arr,target);
    }
}
