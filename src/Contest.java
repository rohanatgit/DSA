public class Contest {
    public static void main(String[] args) {
        String str="hello world sahidoahsdfiihsd ohsdifia khsdihfi asodhfi jaosjdfoj josdj";
        //String ans="";
        String ans=Character.toUpperCase(str.charAt(0))+"";
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                ans+=" "+Character.toUpperCase(str.charAt(i+1));
                i++;
            }
            else{
                ans+=str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}}