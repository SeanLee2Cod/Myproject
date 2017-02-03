package capGraph;

import java.util.Scanner;

public class Main {
    static final char a[]={'A','B','C','D','E','F','G'
                            ,'H','I','J','K','L','M','N'
                            ,'O','P','Q','R','S','T','U'
                            ,'V','W','X','Y','Z'};
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        sysoutGraph(n,m);
    }

    private static void sysoutGraph(int n, int m) {
       for (int i = 0; i <n; i++) {
         if(i<m){
         //当行数小于字母列数m时，递减输出
         for (int j = i; j >0; j--) {
           System.out.print(a[j]);
         }
         //行数小于字母列数时，递增输出
         for (int j = 0; j < m-i; j++) {
             System.out.print(a[j]);
         }
         }
         //当行数大于字母列数m时，递减输出，且只输出m个字母
         else{
         for (int j = i; j >i-m; j--) {
           System.out.print(a[j]);
         }    
         }
           System.out.println();
       }    
    }
}
