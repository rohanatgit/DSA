package Recusion_Assignment;

import java.util.Scanner;

public class Split_array {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
        System.out.println(printanscount(arr,0,arr.length-1,"","",0,0));
    }
public static int printanscount(int arr[],int lb,int ub,String ans1,String ans2,int sum1,int sum2){
        if(lb>ub){
            if(sum1==sum2){
                System.out.println(ans1+" and "+ans2);
                return 1;
            }
            return 0;
        }
        int c1=printanscount(arr,lb+1,ub,ans1+arr[lb]+" ",ans2,sum1+arr[lb],sum2);
        int c2=printanscount(arr,lb+1,ub,ans1,ans2+arr[lb]+" ",sum1,sum2+arr[lb]);
        return c1+c2;
}
}
