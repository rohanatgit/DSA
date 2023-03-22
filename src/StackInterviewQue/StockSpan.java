package StackInterviewQue;

import java.util.ArrayList;
import java.util.List;

public class StockSpan {
     List<Integer> li =null;
     public StockSpan(int price ){
         li=new ArrayList<>();
     }
     public int next(int price){
         li.add(price);
         int c=0;
         for(int i=li.size()-1;i>=0;i--){
             if(li.get(i)<=price){
                 c++;
             }
             else{
                 break;
             }
         }
         return c;
     }

}
