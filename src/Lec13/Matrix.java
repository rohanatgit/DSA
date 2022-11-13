package Lec13;
public class Matrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{10,12,13,5},{8,25,65,4}};//3*4
        print(arr);
    }
    public static void print(int[][]arr){
        for(int col=0;col<arr[0].length;col++){
                for(int row=0;row<arr.length;row++){
                    System.out.print(arr[row][col]+" ");
                }
            System.out.println();
        }
    }
}

