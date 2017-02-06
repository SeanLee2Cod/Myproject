package decompositionFactor;

import java.util.Scanner;

public class Main {
    static final int constant=10000;
    
    //分解质因数
    public static void decompositionQuaFactor(int a, int b,int[]prime) {
        int temp=0;
        for (int i = a; i <=b; i++) {
            System.out.print(i+"=");
            temp=i;
            int count=0;
            while(temp!=1){
              if(temp%prime[count]==0){
                  temp=temp/prime[count];
                  System.out.print(prime[count]);
                  System.out.print(temp==1?"\r\n":"*");
              }else{
                 count++;
              }
          }
      } 
    }
    public static int[] getPrimeArray(int[] array) {
         int prime[]=new int[3000];
         //筛法求素数，其中array[i]=0表示i为素数，其倍数都不属于素数
         for (int i = 2; i <=constant; i++) {
           if(array[i]==0){
               for (int j =2*i; j <=constant; j=j+i) {
                 array[j]=1;
               }
           }
        }
         //将素数值保存到数组prime中
        int k=0;
        for (int i = 2; i <=constant; i++) {
          if(array[i]==0){
              prime[k++]=i;
          }
          
        }
        return prime;
    }
 public static void main(String[] args) {
        int array[]=new int[constant+1];
        //得到2-10000范围内的所有素数，并保存在数组中
        int prime[]=getPrimeArray(array);
        @SuppressWarnings("resource")
        Scanner scn=new Scanner(System.in);
            int a=scn.nextInt();
            int b=scn.nextInt();
        decompositionQuaFactor(a,b, prime);
      }
}
