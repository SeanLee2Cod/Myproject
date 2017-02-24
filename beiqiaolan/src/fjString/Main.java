package fjString;

import java.util.Scanner;

public class Main {
    static String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final char a[]=str.toCharArray(); 
    
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      scn.close();
      System.out.println(getAn(n));
      
    }

    public static String getAn(int n) {
      if(n==1)
          return "A";
      else
          return  getAn(n-1)+a[n-1]+getAn(n-1);
    }

}
