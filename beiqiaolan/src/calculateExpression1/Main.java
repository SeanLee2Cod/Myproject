package calculateExpression1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    //先获取后缀表达式，再根据后缀表达式直接计算，仍然采用双栈法
    static Stack<String> sta_num=new Stack<String>();
    static Stack<String> sta_ch=new Stack<String>();
    //数字栈用于最后的计算
    static Stack<Integer> sta_compu=new Stack<Integer>();
    //存储后缀表达式
    static List<String> list=new ArrayList<String>();
    public static void main(String[] args) {
    //避免报错
    sta_ch.push("(");
      //取出数字字符
      char[]numberCha=new char[10];
      
      Scanner scn=new Scanner(System.in);
      String str=scn.next();
      scn.close();
      //为了将字符栈的元素清空
      str=str+".";
      char[]cha=str.toCharArray();
      int k=0;
      for (int i = 0; i < cha.length; i++) {
          if(cha[i]>='0'&&cha[i]<='9'){
              numberCha[k++]=cha[i];
              continue;
          }
          //数字直接存入list中
          if(k>0){
             list.add(String.valueOf(numberCha, 0, k));
             k=0;
          }
          switch(cha[i]){
          case '+':
               determineLoca();
               sta_ch.push("+");
               break;
          case '-':
              determineLoca();
              sta_ch.push("-");
              break;
          case '*':
              determineLoca1();
              sta_ch.push("*");
              break;
          case '/':
              determineLoca1();
              sta_ch.push("/");
              break;
          case '(':
              sta_ch.push("(");
              break;
          case ')':
              determineLoca();
              sta_ch.pop();
              break;
          case '.':
             determineLoca();
             sta_ch.pop();
          }
      }

      for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
        String string = iterator.next();
        //定义一个计算后缀表达式的函数
        calculateResult(string);
      }
      System.out.println(sta_compu.pop());
    }

    public static void calculateResult(String string) {
      int number1=0;
      int number2=0;
      int number=0;
      switch(string){
      case "+":
         number1=sta_compu.pop();
         number2=sta_compu.pop();
         number=number1+number2;
         sta_compu.push(number);
         break;
      case "-":
          number1=sta_compu.pop();
          number2=sta_compu.pop();
          number=number2-number1;
          sta_compu.push(number);
          break;
      case "*":
          number1=sta_compu.pop();
          number2=sta_compu.pop();
          number=number2*number1;
          sta_compu.push(number); 
          break;
      case "/":
          number1=sta_compu.pop();
          number2=sta_compu.pop();
          number=number2/number1;
          sta_compu.push(number); 
          break;
      default:
          sta_compu.push(Integer.parseInt(string));
        } 
    }

    public static void determineLoca1() {
      while(sta_ch.peek().equals("*")||sta_ch.peek().equals("/")){
          list.add(sta_ch.pop());
      }        
    }

    public static void determineLoca() {
      while(!sta_ch.peek().equals("(")){
          list.add(sta_ch.pop());
      }        
    }

}
