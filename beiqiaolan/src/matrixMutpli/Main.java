package matrixMutpli;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     @SuppressWarnings("resource")
    Scanner scn=new Scanner(System.in);
     while(scn.hasNext()){
         int n=scn.nextInt();
         int m=scn.nextInt();
         int init[][]=new int[n][n];
         for (int i = 0; i < init.length; i++) {
            for (int j = 0; j < init[0].length; j++) {
              init[i][j]=scn.nextInt();   
            }
        }
        int[][]result=computeMatrixPower(init,m,n);
        OutputMatrix(result);
     }
    }

    public static void OutputMatrix(int[][] result) {
      for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result.length; j++) {
            System.out.print(result[i][j]+" ");
        }
        System.out.println();
      }  
    }

    public static int[][] computeMatrixPower(int[][] init, int m,int n) {
        int[][]result=new int[n][n];
        for (int i = 0; i < result.length; i++) {
          result[i][i]=1;
        }
        for (int k = 0; k < m; k++) {
            int[][]temp=new int[n][n];
         for (int i = 0; i < temp.length; i++) {
          for (int j = 0; j < temp.length; j++) {
            for (int j2 = 0; j2 < temp.length; j2++) {
               temp[i][j]+=result[i][j2]*init[j2][j];  
            }
          }  
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                result[i][j]=temp[i][j];  
            }
        }
     }          
        return result;
    }

}
