package DoubtClass;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cow {
    public static boolean isitpossible(int[] stall,int mid,int noc){
        int cows=1;
        int position=stall[0];
        int i=1;
        while(i<stall.length){
            if(stall[i]-position>=mid){
                cows++;
                position=stall[i];
            }
            if(cows>=noc){
                return true;
            }
            i++;
        }
        return false;
    }
    public static int largetstmindistance(int [] stall ,int noc){
        int lo=0;
        int hi=stall[stall.length-1]-stall[0];//9-1
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if (isitpossible(stall,mid,noc)==true){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //int t=sc.nextInt();

            //stall--->n
            int nos=sc.nextInt();
            int noc=sc.nextInt();//cows
            int stall[]=new int[nos];
            for (int i=0;i<stall.length;i++){
                stall[i]=sc.nextInt();
            }
            Arrays.sort(stall);// nlogn
            System.out.println(largetstmindistance(stall,noc));
        }


}
