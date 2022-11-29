package Lec18;

public class Wrapper_Demo {
    public static void main(String[] args) {
        Integer a =100;
        int a1=100;
        System.out.println(a);//100 memory herarcy different
        System.out.println(a1);//100
        Short s1=78;
        Byte b1=18;
        System.out.println(s1);
        System.out.println(b1);
        a=a1;//autoboxing jaab ek primitive ko uske corosponding wrapper m le ja kr rakhte ho usko bolte hai autoboxing
        System.out.println(a);
        Integer ii=100;
        int i=10;
        i=ii;//unboinxg wrappen ko uske corrosonding wale primitive m rakte ho uske bolte hai unboixng
        System.out.println(i);


        //Important
        Integer b11=19;
        Integer b22=19;
        System.out.println(b11==b22);
        Integer c1=190;
        Integer c2=190;
        System.out.println(c1==c2);//int ,long ,byte ke leye -128 se 127 toh alag alag output ayega

    }
}