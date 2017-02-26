package factorialCompu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      scn.close();
      int a[]=new int[5000];
      a[0]=1;
      int temp=0;
      int r=0;
      for(int i=2;i<=n;i++){
        for (int j = 0; j < a.length; j++) {
            temp=a[j]*i+r;
            a[j]=temp%10;
            r=temp/10;
        }
      }
      //输出数组a
      boolean flag=true;
      for (int i = a.length-1; i >=0; i--) {
         if(flag){
             if(a[i]==0);
             else{
               System.out.print(a[i]);
               flag=false;
             }
         }else{
           System.out.print(a[i]);  
         }
        }
    }
}
