package Lec54;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,5,1,8,9,7};
    }
    public static int LongestSequence(int[] arr){
        HashMap<Integer,Boolean>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]-1)){
                map.put(arr[i],false);
            }
            else{
                map.put(arr[i],true);
            }
            if(map.containsKey(arr[i]+1)){
                map.put(arr[i]+1,false);
            }
        }
        int ans=0;
        for(int key:map.)
    }
}
