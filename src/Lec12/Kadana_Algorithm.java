package Lec12;

public class Kadana_Algorithm{
    public static void main(String[] args) {
        int arr[]={1,-5,6,-8,9,5};
        System.out.println(Kadane(arr));
    }
    public static int Kadane(int [] arr){
        int ans=Integer.MIN_VALUE;
        int preSum=0;
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            ans=Math.max(ans,preSum);
            if(preSum<0){
                preSum=0;
            }
        }
         return ans;
    }
}
