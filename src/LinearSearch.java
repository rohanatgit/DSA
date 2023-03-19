public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,3,2,1,10,11};
        int tar=10;
        System.out.println(linear(arr,0,tar,arr.length-1));
    }
    public static int linear(int arr[],int i,int tar,int n) {
        if(i>n){
            return -1;
        }
        if(arr[0]==tar){
            return 0;
        }
       if(i==n){
           return i;
       }
       if(tar==arr[i]){
           return i;
       }
    int ans=   linear(arr,i+1,11,n);
       return ans;
    }
}
