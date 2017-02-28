package shapeOfClipRead;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int m=scn.nextInt();
      int n=scn.nextInt();
      int[][]a=new int[m][n];
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
          a[i][j]=scn.nextInt();  
        }
      }
      scn.close();
      int total=0;
      int x=-1;
      int y=0;
      //写出一个总的while循环，控制语句的结束
      while(total<m*n){
         //向下取数
         while(x+1<m&&a[x+1][y]!=-1){
             System.out.print(a[++x][y]+" ");
             //已经输出的数做上标记
             a[x][y]=-1;
             total++;
         }
         //向右取数
         while(y+1<n&&a[x][y+1]!=-1){
             System.out.print(a[x][++y]+" ");
             a[x][y]=-1;
             total++;
         }
         //向上取数
         while(x-1>=0&&a[x-1][y]!=-1){
             System.out.print(a[--x][y]+" ");
             a[x][y]=-1;
             total++;
         }
         //向左取数
         while(y-1>=0&&a[x][y-1]!=-1){
             System.out.print(a[x][--y]+" ");
             a[x][y]=-1;
             total++;
         }
      }
      
      
      
      
    }

}
