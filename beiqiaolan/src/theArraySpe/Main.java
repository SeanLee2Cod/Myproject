package theArraySpe;

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
      int max=a[0];
      int min=a[0];
      int sum=0;
      for (int i = 0; i < a.length; i++) {
        sum=sum+a[i];
        if(a[i]>max){
            max=a[i];
        }
        if(a[i]<min){
            min=a[i];
        }
      }
      System.out.println(max);
      System.out.println(min);
      System.out.println(sum);
    }
}
