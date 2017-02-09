package costOfPerfect;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      @SuppressWarnings("resource")
    Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      String str=scn.next();
      char[] cha=str.toCharArray();
      int j=n; 
      int c=0;
      int sum=0;
      boolean flag=true;
      for (int i = 0; i < j; i++) {
        for (int k = j-1; k>=i; k--) {
          if(k==i){
            if(n%2==0||c==1){
                flag=false;
            }else{
            c=1;
            sum+=n/2-i;
            } 
            break;
          }
         if(cha[k]==cha[i]){
             for(int m=k;m<j-1;m++){
                cha[m]=cha[m+1];
             }
             sum+=j-k-1;
             j--;
           break;
         }
        }
        if(!flag){
          break;
        }
    }
       if(!flag){
           System.out.println("Impossible");
       }else{
          System.out.println(sum);
       }
    }
}
