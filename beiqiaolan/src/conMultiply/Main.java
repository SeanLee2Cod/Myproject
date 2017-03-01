package conMultiply;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int a=scn.nextInt();
      int b=scn.nextInt();
      int m=a;
      int n=b;
      scn.close();
      int c=0;
      //先求出最大公约数
      while(a%b!=0){
          c=a%b;
          a=b;
          b=c;
      }
      int con=b;
      System.out.println(m*n/con);
    }

}
