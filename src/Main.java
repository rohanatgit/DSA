import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int flag=0;
        while(t-->0){
            int r1=sc.nextInt();
            int r2=sc.nextInt();
            int r3=sc.nextInt();
            if(r1>r2 && r1>r3){
                if(r2+r3<r1){
                    System.out.println("Yes");
                    flag=1;

                }
            }
            else if(r2>r1 && r2>r3){
                if(r1+r3<r2){
                    System.out.println("Yes");
                    flag=1;
                }
            }
            else if(r3>r1 && r3>r2){
                if(r1+r2<r3){
                    System.out.println("Yes");
                    flag=1;
                }
            }

        }
        if(flag==0)
        System.out.println("No");

    }
}