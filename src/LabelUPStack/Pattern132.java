package LabelUPStack;

public class Pattern132 {
    public static void main(String[] args) {
       int arr[]={3,1,4,2};
    }
    public boolean pattern(int arr[]){
        int[]min=new int[arr.length];
        min[0]=arr[0];
        for(int i=1;i<min.length;i++){
            min[i]=Math.min(min[i-1],arr[i]);
        }
    }
