package superlongSums;

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
      int[] a=new int[A.length];
      int[] b=new int[B.length];
      //定义一个存储结果用的数组
      int[] c=new int[100];
      //每一位上的字符转换为整型数字
      for (int i = 0; i < A.length; i++) {
          a[a.length-i-1]=A[i]-'0';
      }
      for (int i = 0; i < B.length; i++) {
          b[b.length-i-1]=B[i]-'0';
      }
      int i=0;
      int r=0;
      int m=0;
      boolean flag=true;
      while(i<a.length&&i<b.length){
          
          if(flag){
            if(a[i]+b[i]<10){
                c[i]=a[i]+b[i];
                r=0;
            }else{
                c[i]=(a[i]+b[i])%10;
                r=(a[i]+b[i])/10;
                flag=false;
            }
            i++;
          }else{
            m=a[i]+b[i]+r;
            if(m<10){
                c[i]=m;
                r=0;
                //r为零，可以用if后的语句进行
                flag=true;
            }else{
                c[i]=m%10;
                r=m/10;
            }
            i++;
          }
      }
      //当两个相加的数位数相同时
      if(i==a.length&&i==b.length){
          if(r==0);
          else{
            c[i]=r;
          }
      //当两个相加的数位数不一样时
      }else if(i==a.length&&i<b.length){
      //r为零，直接将长一点数位的被加数的每一位赋给c[i]
          if(r==0){
            for (int j = i; j < b.length; j++) {
               c[j]=b[j];
            }
      //否则循环进行判断       
          }else{
              flag=true;
              while(i<=b.length){
               //当i的值小于b数组的长度时
                if(i<b.length){
                  if(flag){
                    if(b[i]+r<10){
                      c[i]=b[i]+r;
                      r=0;
                      flag=false;
                  }else{
                      c[i]=(b[i]+r)%10;
                      r=(b[i]+r)/10;
                      flag=true;
                  }
               //r为零
                 }else{
                    c[i]=b[i];
                 }
                    i++;
               //当i的值和等于b数组的长度时（此时b数组的每一位上的值都已经赋给了c数组）
               }else{
                  if(r==0);
                  else{
                    c[i]=r;
                  }
                  i++;
               }
            }
        }
    }else if(i==b.length&&i<a.length){
        if(r==0){
          for (int j = i; j < a.length; j++) {
             c[j]=a[j];
          }
        }else{
           flag=true;
           while(i<=a.length){
             if(i<a.length){
               if(flag){
                 if(a[i]+r<10){
                   c[i]=a[i]+r;
                   r=0;
                   flag=false;
                 }else{
                   c[i]=(a[i]+r)%10;
                   r=(a[i]+r)/10;
                   flag=true;
                 }
               }else{
                 c[i]=a[i];
               }
                 i++;
            }else{
              if(r==0);
              else{
               c[i]=r;
              }
              i++;
            }
          }
        } 
      }
    //输出c[]数组
      flag=true;
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
