package DoubtClassSlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class Murthal_Parantha {
    public static boolean itispossible(int rank[],int mid,int nop){
        int cook=1;
        int paratha=1;//kon sa parata bnayega
        int totaltime=0;
        int total_Paratha=0;
        int i=0;
        while(i<rank.length){
            if(totaltime+paratha*rank[i]<=mid){
                totaltime+=paratha*rank[i];
                paratha++;
                total_Paratha++;
            }
            else{
                i++;
                paratha=1;
                totaltime=0;
            }
            if(total_Paratha>=nop){
                return true;
            }
        }
        return false;
    }
    public static int minimumTime(int rank[],int nop){
        int lo=0;
        int hi=rank[rank.length-1]*(nop*(nop+1))/2;
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(itispossible(rank,mid,nop)==true){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int nop=sc.nextInt();
        int noc=sc.nextInt();
        int rank[]=new int[noc];
        for(int i=0;i<rank.length;i++){
            rank[i]=sc.nextInt();
        }
        Arrays.sort(rank);
        System.out.println(minimumTime(rank,nop));
    }
}
