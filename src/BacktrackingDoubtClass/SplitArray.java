package BacktrackingDoubtClass;

import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        subset(arr,0,"",0);
    }
    public static void subset(int[] arr,int i,String ans,int sum){
         if(i== arr.length){
             System.out.println(ans+" "+sum);
             return;
         }

        subset(arr,i+1,ans+arr[i]+" ",sum+arr[i]);
        subset(arr,i+1,ans,sum);
    }
}
