package calculateExpression;

import java.util.Scanner;
import java.util.Stack;

public class Main {
   /* 采用双堆栈法一边计算后缀表达式（并没有整个后缀表达式求出，只是过程相符），
    * 一边得出计算的结果。整个过程与后缀表达式得出后的计算过程是分不开的（从左至
    * 右扫描表达式，遇到数字时，将数字压入堆栈，遇到运算符时，弹出栈顶的两个数，
    * 用运算符对它们做相应的计算（次顶元素 op 栈顶元素），并将结果入栈）*/
    //定义存储数值的堆栈
    static Stack<Integer> sta_num=new Stack<Integer>();
    //定义存储符号的堆栈
    static Stack<Character> sta_ch=new Stack<Character>();
    public static void main(String[] args) {
      //作为循环结束标志，防止栈空出错
      sta_ch.push('(');
      Scanner scn=new Scanner(System.in);
      String str=scn.next();
      scn.close();
      //作为算术式结束标志
      str=str+'.';
      char[]cha=str.toCharArray();
      char[] number=new char[100];
      int k=0;
      for (int i = 0; i < cha.length; i++) {
          //取出数字
          if(cha[i]>='0'&&cha[i]<='9'){
              number[k++]=cha[i];
              continue;
          }
          //获取数值,并存入sta_num中
          if(k!=0){
          String numStr=String.valueOf(number, 0, k);
          sta_num.push(Integer.parseInt(numStr));
          }
          k=0;
          //碰到非数字字符时，分类讨论：优先级不一样，执行的方法不一样
          switch(cha[i]){
          case '+':
              //在进栈前先判断符号栈顶的符号，和'-'一样，在它进栈前需要将所有非'('元素出栈
              popStakeCalcu1();
              sta_ch.push('+');
              break;
          case '-':
              popStakeCalcu1();
              sta_ch.push('-');
              break;
          case '*':
              popStakeCalcu2();
              sta_ch.push('*');
              break;
          case '/':
              popStakeCalcu2();
              sta_ch.push('/');
              break;
          case '(':
              sta_ch.push('(');
              break;
          case ')':
              popStakeCalcu1();
              //弾出与之相对的')'
              sta_ch.pop();
              break;
          //数字串结束
          case '.':
              popStakeCalcu1();
          }
      }
      System.out.println(sta_num.pop());
    }
  //定义函数，处理遇到'+','-',')'时的处理办法
  public static void popStakeCalcu1() {
    while(sta_ch.peek()!='('){
        int number=0;
        int number1=sta_num.pop();
        int number2=sta_num.pop();
        switch(sta_ch.pop()){
        case '+': number=number2+number1; break;
        case '-': number=number2-number1; break;
        case '*': number=number2*number1; break;
        case '/': number=number2/number1; break;
        }
        //将计算结果入栈
        sta_num.push(number);
    }    
  }
  //定义函数，遇到'*'，'/'时的处理方法:只有遇到'*'或'/'时才弾栈，并运算
  public static void popStakeCalcu2(){
      while(sta_ch.peek()=='*'||sta_ch.peek()=='/'){
          int number=0;
          int number1=sta_num.pop();
          int number2=sta_num.pop();
          switch(sta_ch.pop()){
          case '*': number=number2*number1; break;
          case '/': number=number2/number1; break;
          }
          //将计算结果入栈
          sta_num.push(number);
      }
  }

}
