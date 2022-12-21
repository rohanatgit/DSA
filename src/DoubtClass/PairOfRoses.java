package DoubtClass;

import java.util.Scanner;

public class PairOfRoses {
    public static void pairofroes(int price[],int m){
        int p1=0;//1 st rose price
        int p2=0;//1 st rose price
        int min=Integer.MAX_VALUE;
        int diff=0;
        for(int i=0;i<price.length;i++){
            for(int j=i+1;j<price.length;j++){
                if(price[i]+price[j]==m){
                   diff=Math.abs(price[i]-price[j]);
                    if(diff<min){
                        min=diff;
                        p1=price[i];
                        p2=price[j];
                    }
                }
            }
        }
        System.out.println("Deepak should buy roses whose prices are "+p1+" and "+p2+".");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
         int n=sc.nextInt();
         int price[]=new int[n];
         for(int i=0;i<n;i++){
             price[i]=sc.nextInt();
         }
         int m=sc.nextInt();
         pairofroes(price,m);
        }
    }
}
