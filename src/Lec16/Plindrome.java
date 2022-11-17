package Lec16;

public class Plindrome {
    public static boolean palindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="madam";
        System.out.println(palindrome(str));
    }
}
