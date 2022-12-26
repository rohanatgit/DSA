package DoubtClass;

import java.util.Scanner;

public class Pair_of_Roses {
    public static void pairofroses(int price[],int m){
        int p1=0;//1 rose pric;
        int p2=0;//2 rose price
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<price.length;i++){
            for(int j=i+1;j<price.length;j++){
                if(price[i]+price[j]==m){
                    int min=Math.abs(price[i]-price[j]);
                    if(diff>min){
                        min=diff;
                        p1=price[i];
                        p2=price[j];
                    }
                }
            }
        }
        System.out.println("Deepak should buy roses whose prices are" +p2 +"and" +p1);
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
            pairofroses(price,m);
        }
    }
}
