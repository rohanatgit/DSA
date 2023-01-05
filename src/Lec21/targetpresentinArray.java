package Lec21;

public class targetpresentinArray {
    public static int occ(int arr[],int i,int target){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return occ(arr,i+1,target);
    }
    public static void main(String[] args) {
        int arr[]={2,3,7,3,3,7,6,3};
        int target=3;
        System.out.println(occ(arr,0,target));
    }
}
