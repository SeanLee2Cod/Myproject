package pascialTriangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      @SuppressWarnings("resource")
    Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int[][]a=new int[n][n];
      //求杨辉三角的二维数组
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j <=i; j++) {
            if(j==0||j==i)
              a[i][j]=1;
            else
                a[i][j]=a[i-1][j-1]+a[i-1][j];
        }
      }
      //输出数组
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
           }
                System.out.println();
        }
      }
    }
