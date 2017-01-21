package hexToOct;

import java.util.Scanner;

public class Main {
    static int[] b=new int[10000001];
    public static void main(String[] args) {
      @SuppressWarnings("resource")
    Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();    
      String[]str=new String[n];
      for (int i = 0; i < str.length; i++) {
        str[i]=scn.next();
      }
      String strHex=null;
      String[]strOct=new String[n]; 
      for (int i = 0; i < str.length; i++) {
        strHex=toBinaty(str[i]);
        strOct[i]=toOct(strHex);
      } 
      for (int i = 0; i < strOct.length; i++) {
        System.out.println(strOct[i]);
    }
    }

    public static String toOct(String strHex) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        sb.append(strHex);
        int length=strHex.length();
        if(length%3==0){}
        else if(length%3==1){sb.insert(0, "00");}
        else if(length%3==2) {sb.insert(0, '0');}
        String subStr=null; int i=0;
        while(i<sb.length()){
            subStr=sb.substring(i, i+3);
            if(subStr.equals("000")&&i!=0){sb2.append(0);}
            else if(subStr.equals("001")){sb2.append(1);}
            else if(subStr.equals("010")){sb2.append(2);}
            else if(subStr.equals("011")){sb2.append(3);}
            else if(subStr.equals("100")){sb2.append(4);}
            else if(subStr.equals("101")){sb2.append(5);}
            else if(subStr.equals("110")){sb2.append(6);}
            else if(subStr.equals("111")){sb2.append(7);}
            i=i+3;
        }
     
        return sb2.toString();
    }

    public static String toBinaty(String string) {
        StringBuilder sb=new StringBuilder();
        char[]a=string.toCharArray();
        for (int i = 0; i < a.length; i++) {
            switch(a[i]){
            case'0':sb.append("0000"); break;
            case'1':sb.append("0001"); break;
            case'2':sb.append("0010"); break;
            case'3':sb.append("0011"); break;
            case'4':sb.append("0100"); break;
            case'5':sb.append("0101"); break;
            case'6':sb.append("0110"); break;
            case'7':sb.append("0111"); break;
            case'8':sb.append("1000"); break;
            case'9':sb.append("1001"); break;
            case'A':sb.append("1010"); break;
            case'B':sb.append("1011"); break;
            case'C':sb.append("1100"); break;
            case'D':sb.append("1101"); break;
            case'E':sb.append("1110"); break;
            case'F':sb.append("1111"); break;
            }
        }
        return sb.toString();        
    }
}
