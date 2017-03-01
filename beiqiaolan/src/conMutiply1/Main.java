package conMutiply1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int a=scn.nextInt();
      int b=scn.nextInt();
      scn.close();
      int m=a;
      int n=b;
      //使用始终相减的方法求最大公约数
      while(m!=n){
        if(m>n){
          m=m-n;
        }else{
          n=n-m;
        }
      }
      int con=m;
      System.out.println(a*b/con);
    }

}
