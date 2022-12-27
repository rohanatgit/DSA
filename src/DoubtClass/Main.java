package DoubtClass;

import java.util.Scanner;

public class Main {
    public static boolean itispossible(int pages[],int mid,int nos){
        int i=0;
        int page_read=0;
        int student=1;
        while(i<pages.length){
            if(page_read+pages[i]<=mid){
                page_read+=pages[i];
                i++;
            }
            else{
                student++;
                page_read=0;
            }
        }
        if(student>nos){
            return false;
        }
        return true;
    }
    public static int minimumpages(int pages[],int nos){
        int lo=0;
        int hi=0;
        int ans=0;
        for(int i=0;i<pages.length;i++){
            hi=hi+pages[i];
        }
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(itispossible(pages,mid,nos)==true){
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
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int nos=sc.nextInt();
            int pages[]=new int[n];
            for(int i=0;i<pages.length;i++){
                pages[i]=sc.nextInt();
            }
            System.out.println(minimumpages(pages,nos));
        }
    }
}
