package chipTest;

import java.util.Scanner;

public class Main {
   /* 此题很明显需要用到二维数组，由题目可以清晰的了解到，
    * 好的芯片数目总是多于坏的芯片芯片数目，故在每一列当中
    * 除了一个无效数据（自身判断自身）以外，若被判断元素是
    * 正确的，该列的非左对角线元素之和应该大于等于n/2(当该
    * 条件成立时，被判断元素为好的，则好芯片的数目至少为n
    * /2+1，满足好芯片数目多于坏芯片)
    */    
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int [][]a=new int[n][n];
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
            a[i][j]=scn.nextInt();
        }
      }
      scn.close();
      int count=0;
      for (int i = 0; i < n; i++) {
         count=0;
        for (int j = 0; j < n; j++) {
          if(i!=j&&a[j][i]==1){
                count++;
          }
          if(count>=n/2){
            if(i!=n-1){
                System.out.print(i+1+" ");
            }else{
                System.out.print(i+1);
            }
                break;
          }
        } 
      }     
    }
 }
