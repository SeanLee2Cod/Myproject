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
          /*在遍历完整个串没有相同的元素时，如果n的长度为偶数，那么该串一定不对称，
                              如果n的长度为奇数则需要分情况讨论：
              1.整个串中只有一个这样的字母
              2.有多个
                             对情况1，可以将该字母放在串中间的位置，对情况2则可以结束程序。*/
            if(n%2==0||c==1){
                flag=false;
            }else{
            c=1;
            sum+=n/2-i;
            } 
            break;
          }
          //在找到相同的字符时，移到与cha[i]所对应的位置
         if(cha[k]==cha[i]){
             for(int m=k;m<j-1;m++){
                cha[m]=cha[m+1];
             }
             sum+=j-k-1;
             j--;
           break;
         }
        }
        //出现
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
