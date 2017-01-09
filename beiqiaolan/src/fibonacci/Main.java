package fibonacci;

import java.util.Scanner;
public class Main {

    private static final long CONSTANT = 10007;

    public static void main(String[] args) {
        long n=0;
        long a=1;
        long b=1;
        long i=0;
        long yushu=0;  
        long temp=0;
        Scanner scn=new Scanner(System.in);
        n=scn.nextLong();
        scn.close();
        if(n==1||n==2){
          yushu=1; 
        }else{
        for(i=3;i<=n;i++){
           temp=b;
           b=(a+b)%CONSTANT;
           a=temp;
        }
        yushu=b;
       }
        System.out.println(yushu);
    }
}
