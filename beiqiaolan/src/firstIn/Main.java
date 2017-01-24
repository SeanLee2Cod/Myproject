package firstIn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      @SuppressWarnings("resource")
    Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int[]a=new int[n];
      for (int i = 0; i < a.length; i++) {
         a[i]=scn.nextInt();
      }
      int x=scn.nextInt();
      boolean flag=false;
      for (int i = 0; i < a.length; i++) {
        if(x==a[i]){
            flag=true;
            System.out.println(i+1);
            break;
        }
      }
      if(flag==false){
          System.out.println(-1);
      }
    }
}
