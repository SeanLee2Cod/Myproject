package sortArray;

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
      //Buble sort
      int temp=0;
      for (int i = 0; i < a.length-1; i++) {
        for (int j = 0; j < a.length-i-1; j++) {
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
      }
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i]+" ");
    }
    }
}
