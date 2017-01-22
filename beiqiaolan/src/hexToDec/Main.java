package hexToDec;

import java.util.Scanner;

public class Main {

    public static long hexToDec(String str) {
        char[]a=str.toCharArray();
        long s=0;
        int []b=new int[a.length];
        for (int i = 0; i < b.length; i++) {
          switch(a[i]){
          case '1':b[i]=1;break;
          case '2':b[i]=2;break;
          case '3':b[i]=3;break;
          case '4':b[i]=4;break;
          case '5':b[i]=5;break;
          case '6':b[i]=6;break;
          case '7':b[i]=7;break;
          case '8':b[i]=8;break;
          case '9':b[i]=9;break;
          case 'A':b[i]=10;break;
          case 'B':b[i]=11;break;
          case 'C':b[i]=12;break;
          case 'D':b[i]=13;break;
          case 'E':b[i]=14;break;
          case 'F':b[i]=15;break;
          }
        }
        s=b[0];
        for (int i = 0; i < b.length-1; i++) {
           s=s*16+b[i+1]; 
        }
        return s;
    }
    public static void main(String[] args) {
       @SuppressWarnings("resource")
       Scanner scn=new Scanner(System.in);
       String str=scn.next();
       long dec=hexToDec(str);
       System.out.println(dec);
       
    }
}
