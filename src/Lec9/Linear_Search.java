package Lec9;

public class Linear_Search {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        int intem=4;
        System.out.println(LinearSearch(arr,intem));
    }
    public static int LinearSearch(int [] arr,int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }

        }
        return -1;
    }
}
