package Lec19;

public class Kartik_Bhaiya_And_String {
    public static int maximumlength(String str,int k,char ch){
        int si=0;
        int ei=0;
        int ans=0;

        while(ei<str.length()){
            //window grow


            //window small


            //ans calculate

        }
    return ans;
    }
    public static void main(String[] args) {
        String str="abbbaababab";
        int k=3;
        int flipa=maximumlength(str,k,'a');
        int flipb=maximumlength(str,k,'b');
        System.out.println(Math.max(flipa,flipb));

    }

}
