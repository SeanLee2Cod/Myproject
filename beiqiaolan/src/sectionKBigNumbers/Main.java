package sectionKBigNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int []a=new int[n];
      for (int i = 0; i < a.length; i++) {
        a[i]=scn.nextInt();
      }
      int m=scn.nextInt();
      int b[][]=new int[m][3];
      for (int i = 0; i < b.length; i++) {
        for (int j = 0; j < b[0].length; j++) {
           b[i][j]=scn.nextInt();      
        }
      }
      scn.close();
      int count=0;
      for (int i = 0; i < b.length; i++) {
          //定义一个新的数组，避免将数组a[]的数的顺序改变
          int c[]=new int[b[i][1]-b[i][0]+1];
          //将a[]中对应位置的元素值赋给新的数组c[]
          count=0;
          for (int j = b[i][0]-1; j < b[i][1]; j++) {
              c[count]=a[j];
              count++;
          }
          Arrays.sort(c);
          //输出元素
          System.out.println(c[c.length-b[i][2]]);
      }
    }
}
