package decToHex;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    //将十进制数转化为十六进制
    public static void decToHex(int n) {
       Stack<Integer> stack=new Stack<Integer>(); 
       int discu=n;
       if(discu==0){
         stack.myAdd(0);
       }
       while(discu!=0){
           stack.myAdd(discu%16);
           discu=discu/16;
       }
       int outPut=0;
       while(!stack.isEmpty()){
           outPut=stack.myGet();
           if(outPut<10){
               System.out.print(outPut);
           }
           else{
               switch(outPut){
               case 10:System.out.print('A');break;
               case 11:System.out.print('B');break;
               case 12:System.out.print('C');break;
               case 13:System.out.print('D');break;
               case 14:System.out.print('E');break;
               case 15:System.out.print('F');break;
               }
           }
       }
    }
    
    public static void main(String[] args) {
      @SuppressWarnings("resource")
    Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      decToHex(n);
    }
}
class Stack<T>{
    LinkedList<T> l=new LinkedList<T>();
    //入栈操作
   public void myAdd(T t){
        l.addFirst(t);
    }
    //出栈操作
   public T myGet(){
       return l.removeFirst();
   }
    //判断栈是否为空
   public boolean isEmpty(){
       return l.isEmpty();
   }
    
    
}