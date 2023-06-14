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
           upheapify(pi);
        }
    }
    public void swap(int i,int j){
       int ith=this.data.get(i);//20
       int jth=this.data.get(j);//40
        this.data.set(i,jth);
        this.data.set(j,ith);
    }
    public int remove(){
        swap(0,this.data.size()-1);
        int rv=this.data.remove(this.data.size()-1);
        downheapify(0);
        return rv;

    }

    private void downheapify(int pi) {
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;
        if(lci<this.data.size() && this.data.get(lci)<this.data.get(mini)){
            mini=lci;
        }
        if(rci<this.data.size() && this.data.get(rci)<this.data.get(mini)){
            mini=rci;
        }
        if(mini!=pi){
            swap(mini,pi);
            downheapify(mini);
        }
    }
    public int getmin(){
        return this.data.get(0);
    }
    public int size(){
        return this.data.size();
    }
    public void display()
    {
        System.out.println(this.data);
    }

    public static void main(String[] args) {
        Heap hp=new Heap();
        hp.add(10);
        hp.add(20);
        hp.add(30);
        hp.add(5);
        hp.add(7);
        hp.add(2);
        System.out.println(hp.getmin());
        hp.display();

    }
}
