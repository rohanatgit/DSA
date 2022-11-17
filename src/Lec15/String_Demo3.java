package Lec15;

public class String_Demo3 {
    public static void main(String[] args) {
        String str="abcdef";
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2,5));//substring
        String s1=str.substring(2,5);
        System.out.println(s1);
        System.out.println(str.substring(2));//2 se last mai substring methord bhar banta hai
        System.out.println(str.substring(1,1));// Answer kuch nahi ayega
        System.out.println(str.concat(s1));
        String anotherString="abcdef";
        System.out.println(str.compareTo(anotherString ));//Ek Ek character match kr raha hay
        String s2="ax";
        if(str.compareTo(s2)>0){
            System.out.println(str);//dicsonary se match krta hai same hai ki nahi hai bada hai toh position ata hai Character wise prit krta hai ye agar a hai aur dusre String mai b hai toh b print hoga kyoki b bada hai For example coding secound string blocks toh coading jeet jayga aur 1 print ho jayga
        }
        else{
            System.out.println(s2);
        }
    }
}
