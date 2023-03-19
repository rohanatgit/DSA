package CodeForces;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int es = 0;
            int os = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    os += arr[i];
                } else {
                    es += arr[i];
                }
            }
            if (es > os) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }}
