package Lec19;

public class Product_Less_Than_k {
    public static int countnoofsubarray(int arr[],int k){
        int si=0;
        int ei=0;
        int ans=0;
        int p=1;//kisi bhi no ko zero se multiply k leye 1 leya hai
        while(ei<arr.length){
            //window grow
            p=p*arr[ei];

            //window small
            while(p>=k){
                p=p/arr[si];
                si++;
            }

            //ans calculate
            ans=ans+ei-si+1;
                    ei++;


        }
      return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,3};
        int k=10;
    }

}
