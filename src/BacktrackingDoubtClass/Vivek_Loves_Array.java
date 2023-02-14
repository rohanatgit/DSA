package BacktrackingDoubtClass;

import java.util.Scanner;

public class Vivek_Loves_Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(Loves_Array(arr,0,n-1));
        }
    }
    public static int Loves_Array(int [] arr,int si,int ei){

    }
}
