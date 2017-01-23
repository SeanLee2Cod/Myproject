package specialPalin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       @SuppressWarnings("resource")
    Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       for (int i = 1; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            for (int j2 = 0; j2 <10; j2++) {
                if(((i+j)*2+j2)==n){
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(j2);
                    System.out.print(j);
                    System.out.print(i);
                    System.out.println();
                }
            }
        }
     }
       for (int i = 1; i <10; i++) {
        for (int j = 0; j < 10; j++) {
            for (int j2 = 0; j2 < 10; j2++) {
                if(2*(i+j+j2)==n){
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(j2);
                    System.out.print(j2);
                    System.out.print(j);
                    System.out.print(i);  
                    System.out.println();
                }
            }
        }
    }
    }
}
