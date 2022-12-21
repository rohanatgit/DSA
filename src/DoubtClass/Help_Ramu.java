package DoubtClass;

import java.util.Scanner;

public class Help_Ramu {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        int c3=sc.nextInt();
        int c4=sc.nextInt();
        int n=sc.nextInt();//Rickshow
        int m=sc.nextInt();//cab
        int [] ricksha=new int[n];
        int cabs[]=new int[m];
        for (int i=0;i<ricksha.length;i++){
            ricksha[i]=sc.nextInt();
        }
        for (int i=0;i<cabs.length;i++){
            cabs[i]=sc.nextInt();
        }
        int rickshow_ride=0;
        int cab_ride=0;
        for(int i=0;i<ricksha.length;i++){
            rickshow_ride+=Math.min(ricksha[i]*c1,c2);
        }
        for(int i=0;i<cabs.length;i++){
            rickshow_ride+=Math.min(cabs[i]*c1,c2);
        }
        rickshow_ride=Math.min(rickshow_ride,c3);
        cab_ride=Math.min(cab_ride,c3);
        int ans=Math.min(c4,cab_ride+rickshow_ride);
        System.out.println(ans);
       }
    }
}
