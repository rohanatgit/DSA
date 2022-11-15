import java.util.*;
public class Sort {
    public static void main (String args[]) {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=new int[n];
        int c=0;
        int p=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) {
                ans[c] = 0;
                c++;
            }
           else if(arr[i]==1) {
                ans[c] = 1;
                c++;
            }
		     else if (arr[i]==2){
                ans[c]=2;
                c++;
            }
        }
        for(int j=0;j<n;j++){
            System.out.print(ans[j]+" ");
        }
    }
}
