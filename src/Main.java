/******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/
import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
    public static void solve() {
        String str = sc.next();
        String s = "531654661616461615451161651961645616196449461489";
        int m = str.length();
        int c = 0;
        for (int i = 0; i < m; i++) {
            if (str.charAt(i) == s.charAt(i)) {
                c++;
            } else {
                break;
            }
        }
        System.out.println(c + "\n");
    }
}