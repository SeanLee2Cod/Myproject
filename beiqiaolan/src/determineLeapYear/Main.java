package determineLeapYear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      @SuppressWarnings("resource")
    Scanner scn=new Scanner(System.in);
      int year=scn.nextInt();
      boolean result=toDetermineLeap(year);
      if(result==true){
          System.out.println("yes");
      }else{
          System.out.println("no");
      }
    
    }

    public static boolean toDetermineLeap(int year) {
        if((year%4==0&&year%100!=0)||year%400==0){
            return true;
        }
        else
            return false;
    }
}
