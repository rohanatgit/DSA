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
             for(int mid=si;mid<arr.length;mid++){
                  int s1=0;
                  for(int i=si;i<=mid;i++){
                       s1=s1+arr[i];
                  }
                    int s2=0;
                  for(int i=mid+1;i<=ei;i++){
                      s2+=arr[i];
                  }
                  if(s1==s2){
                      int lf=Loves_Array(arr,si,mid);
                      int rf =Loves_Array(arr,mid+1,ei);
                      return Math.max(lf,rf)+1;//apna wala
                  }
             }
             return 0;
    }
}
