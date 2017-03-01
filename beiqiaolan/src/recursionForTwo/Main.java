package recursionForTwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int k=scn.nextInt();
      int n=scn.nextInt();
      scn.close();
      int s=getBioExpression(k,n);
      System.out.println(s);
    }

    public static int getBioExpression(int k, int n) {
        if(k==0||k==n){
            return 1;
        }else{
            int n1=getBioExpression(k, n-1);
            int n2=getBioExpression(k-1,n-1);
            return n1+n2;
        }
    }

}
