package superlongSum1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String strA=scn.nextLine();
        String strB=scn.nextLine();
        scn.close();
        //获取每个数字字符串的每一位所对应的字符
        char[] A=strA.toCharArray();
        char[] B=strB.toCharArray();
        //定义两个整型数组
        int[] a=new int[100];
        int[] b=new int[100];
        //定义一个存储结果用的数组
        int[] c=new int[100];
        //每一位上的字符转换为整型数字
        for (int i = 0; i < A.length; i++) {
            a[A.length-i-1]=A[i]-'0';
        }
        for (int i = 0; i < B.length; i++) {
            b[B.length-i-1]=B[i]-'0';
        }
        int i=0;
        int temp=0;
        int r=0;
        while(i<c.length){
          temp=a[i]+b[i]+r;
          c[i]=temp%10;
          r=temp/10;
          i++;
        }
      //输出数组c
        boolean flag=true;
        for(int j=c.length-1;j>=0;j--){
            if(flag){
                if(c[j]==0);
                else{
                 System.out.print(c[j]);   
                 flag=false;                
                }
            }else{
               System.out.print(c[j]);
            }  
        }
    }
}
