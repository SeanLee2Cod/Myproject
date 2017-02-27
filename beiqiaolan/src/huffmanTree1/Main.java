package huffmanTree1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    //使用优先队列PriorityQueue
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
      for (int i = 0; i <n; i++) {
        pq.offer(scn.nextInt());
      }
      scn.close();
      //进出队列，求出sum
      int sum=0;
      int temp1=0;
      int temp2=0;
      while(pq!=null&&pq.size()>1){
          temp1=pq.poll();
          temp2=pq.poll();
          sum=sum+temp1+temp2;
          pq.offer(temp1+temp2);
      }
      System.out.println(sum);
    }
}
