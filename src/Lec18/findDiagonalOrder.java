package Lec18;

import java.util.ArrayList;
import java.util.Collections;

public class findDiagonalOrder {
    public static int[] findDiagonalOrderr(int[][] mat){
         int n=mat.length;
         int m=mat[0].length;
         int k=0;
         int ans[]=new int[n*m];
         int i=0;
         for(int d=0;d<n+m-1;d++){
             int r=0;
             int c=0;
             if(d<m){
                 r=0;
                 c=0;
             }
             else{
                 r=d-m+1;
                 c=m-1;
             }
             ArrayList<Integer>list=new ArrayList<>();
             while(r<n && c>=0){
                 list.add(mat[r][c]);
                 r++;
                 c--;
             }
             if(d%2==0){
//                 Collections.reverse(list); Reverse kr rhe hai bss
                 for( i=list.size()-1;i>=0;i--){
                     ans[k]=list.get(i);
                     k++;
                 }
             }
             else{
                 for( i=0;i<list.size();i++){
                     ans[k]=list.get(i);
                     k++;
                 }
             }
//             for(int val:list){
//                 ans[i]=val;
//                 i++;
//             }
         }
            return ans;
    }
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        findDiagonalOrderr(arr);
    }
}

