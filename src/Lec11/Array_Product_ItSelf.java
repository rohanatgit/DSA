package Lec11;

public class Array_Product_ItSelf {
    public static void main(String[] args) {
        int arr[]={2,5,7,4};
        product(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] product(int [] nums){
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=1;
        for(int i=1;i<left.length;i++){
       left[i]=left[i-1]*nums[i-1];
        }
        right[n-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        for(int i=0;i<right.length;i++){
            nums[i]=left[i]*right[i];
        }
        return nums;
    }
}
