package stringType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      @SuppressWarnings("resource")
    Scanner scn=new Scanner(System.in);
      String str1=scn.next();
      String str2=scn.next();
      int type=toDefineStrType(str1,str2);
      System.out.println(type);
    }

    public static int toDefineStrType(String str1, String str2) {
      if(str1.length()!=str2.length()){
          return 1;
      }else{
        if(str1.equals(str2)){
            return 2;
        }
        else if(str1.equalsIgnoreCase(str2)){
            return 3;
       }
       else{
           return 4;
       }
     }
   }
 }
