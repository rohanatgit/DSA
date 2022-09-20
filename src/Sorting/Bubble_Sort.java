package Sorting;
class  Bubble_Sort{
    public void sortColors(int[] arr) {
        for(int pass=1;pass<arr.length;pass++){
            for(int i=0;i<arr.length-pass;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.print("[");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]);
        System.out.print("]");
    }
}
