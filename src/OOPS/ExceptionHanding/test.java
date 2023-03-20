package OOPS.ExceptionHanding;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test {
    public static void main(String[] args) {
        try{
            FileInputStream fis =new FileInputStream("askjb");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
