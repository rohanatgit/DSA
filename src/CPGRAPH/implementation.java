package CPGRAPH;

public class implementation {
    int[][] adjmatrix;
    public implementation(int nodes){
        this.adjmatrix=new int[nodes][nodes];
    }
    public void addEdge(int u,int v){
        adjmatrix[u][v]=1;
        adjmatrix[v][u]=1;
    }

    public static void main(String[] args) {
        implementation g= new implementation(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        System.out.println(g);
    }
}
