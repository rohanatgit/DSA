package Lec34;

public class Palindrome_Substring {
    public static void main(String[] args) {
               String str="nitin";
        System.out.println(countPalidrome(str));
    }
    public static int countPalidrome(String str){
        int count=0;
        for(int axis=0;axis<str.length();axis++){
               for(int orbit=0;axis-orbit>=0 && axis+orbit<str.length();orbit++){
                   if(str.charAt(axis-orbit)==str.charAt(axis+orbit)){
                       count++;
                   }
                   else{
                       break;
                   }
               }
        }
        for(double axis=0.5;axis<str.length();axis++){
            for(double orbit=0.5;axis-orbit>=0 && axis+orbit<str.length();orbit++){
                if(str.charAt((int)(axis-orbit))==str.charAt((int)(axis+orbit))){
                    count++;
                }
                else{
                    break;
                }
            }
        }
      return count;
    }
}
