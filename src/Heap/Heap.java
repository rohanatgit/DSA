package Heap;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer>data=new ArrayList<>();
    public void add(int item){
        this.data.add(item);
        upheapify(this.data.size()-1);
    }

    private void upheapify(int ci) {
        int pi=(ci-1)/2;
        if(this.data.get(pi)>this.data.get(ci)){
           swap(pi,ci);
        }
    }
    public void swap(int i,int j){
       int ith=this.data.get(i);//20
       int jth=this.data.get(j);//40
        this.data.set(i,jth);
        this.data.set(j,ith);
    }
}
