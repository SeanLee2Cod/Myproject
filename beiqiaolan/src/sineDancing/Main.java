package sineDancing;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      scn.close();
      //将式子左侧的所有括号先输出
      for (int i = 1; i < n; i++) {
        System.out.print("(");  
      }
      int m=n;
      for (int i = 1; i <= n; i++) {
            //输出An
            printAn(i);
            System.out.print("+"+m);
            if(m!=1){
              System.out.print(")");
            }
            m--;    
      }
    }
    //输出An
    public static void printAn(int i) {
      for (int j = 1; j <=i; j++) {
        System.out.print("sin("+j);
       //当j!=i时其后部才需要有“+”、“-”号
        if(j!=i){
          if(j%2!=0){
             System.out.print("-");
          }else{
            System.out.print("+");
          }
       }
     }
      //补全An右侧所有的括号
      for (int j = 0; j < i; j++) {
        System.out.print(")");   
      }
   }
}
