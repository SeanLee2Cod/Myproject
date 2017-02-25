package rabbitTortoiseRace;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int v1=scn.nextInt();
      int v2=scn.nextInt();
      int t=scn.nextInt();
      int s=scn.nextInt();
      int l=scn.nextInt();
      scn.close();
      //定义兔子跑的路程s1
      int s1=0;
      //定义乌龟跑的路程
      int s2=0;
      //定义兔子等待的累计时间tCount
      int tCount=0;
      boolean flag=true;
      //记录下比赛结束时的时间
      int sumTime=0;
      //获胜时间最长只能是乌龟跑完全程所用的
      for(int i=1;i<=l/v2;i++){
         //如果兔子没有领先t米及以上它会接着跑或者兔子等了s秒过后它也会接着跑
         if((s1-s2<t&&tCount==0)||tCount==s){
             s1=s1+v1;
             if(tCount==s){
               flag=true;
               tCount=0;
             }
         }else{
             flag=false;
         }
         //兔子处于等待状态，当时间未达到s秒时，兔子不会继续跑
         if(flag==false){
             tCount++;
         }
         s2=s2+v2;
         //判断兔子和乌龟谁先到达终点
         if((s1==l&&s2==l)||(s1==l&&s2<l)||(s1<l&&s2==l)){
            sumTime=i;
            break;
         }
      }
      if(s1==l&&s2==l){
          System.out.println("D");
      }else if(s1==l&&s2<l){
          System.out.println("R");
      }else{
          System.out.println("T");
      }
      //输出所用的时间
      System.out.print(sumTime);
    }

}
