package Lec32;

public class Time_and_Space_Complexity {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("hey");   //constant toime 100 baar chalega
        }
        //Linear Search --> 0(N)
        //Binary Search --> 0(NlogN)
        int i = 0;
        int n = 100;
        while (i < n) {
            System.out.println("nsasd");
            i++;  // 0(N)
        }
        while(i<n){
            System.out.println("Heyyy");
            i*=2; //0(log(N))
        }
        while(n>0){
            System.out.println("kjask");
            n/=2;
            //0(log(n))
        }
        while(i<=n){
            System.out.println("hi");
            i+=2;
            i+=3;
            //0(n)
        }
        
    }
}