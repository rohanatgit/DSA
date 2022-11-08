package Lec11;

public class MaximumSubArray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,-2,9,8};
        System.out.println(maxsum(arr));
    }
    public static int maxsum(int[] arr){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int presum=0;
            for(int j=0;j<arr.length;j++){
                presum+=arr[j];
                ans=Math.max(ans,presum);
            }
        }
        return ans;
    }
}
