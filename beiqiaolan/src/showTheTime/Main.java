package showTheTime;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      @SuppressWarnings("resource")
      Scanner scn=new Scanner(System.in);
      int time=scn.nextInt();
      int hour=time/3600;
      int minute=time%3600/60;
      int second=time%3600%60;
      System.out.println(hour+":"+minute+":"+second);
    }
}
