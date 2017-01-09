package theAreaOfCircle;

import java.math.BigDecimal;
import java.util.Scanner;

class Main {

    private static final double PI = Math.atan(1.0)*4;

    public static void main(String[] args) {
      @SuppressWarnings("resource")
    Scanner scn=new Scanner(System.in);
      int r=scn.nextInt();
      BigDecimal s=new BigDecimal(PI*r*r);
      BigDecimal si=s.setScale(7, BigDecimal.ROUND_HALF_UP);
      System.out.println(si);
    }

}
