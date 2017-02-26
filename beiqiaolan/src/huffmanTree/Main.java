package huffmanTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    //使用列表list
    public static void main(String[] args) {
      ArrayList<Integer> al=new ArrayList<Integer>();
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      for (int i = 0; i < n; i++) {
        al.add(scn.nextInt());
      }
      scn.close();
      //每次会减少一个元素（去掉两个最小的，留下他们的和），最后只剩下一个，故一共要进行n-1次
      int sum=0;
      for(int i=1;i<n;i++){
        huffmanFind(al); 
        sum=sum+al.get(al.size()-1); 
      }
      System.out.println(sum);
    }
    private static void huffmanFind(ArrayList<Integer> al) {
        int temp;
        Collections.sort(al);
        temp=al.get(0)+al.get(1);
        al.remove(0);
        al.remove(0);
        al.add(temp);
    }
}
