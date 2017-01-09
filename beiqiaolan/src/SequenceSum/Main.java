package SequenceSum;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      @SuppressWarnings("resource")
    Scanner scn=new Scanner(System.in);
      long n=scn.nextLong();
      long m=n+1;
      BigDecimal n1=BigDecimal.valueOf(n);
      BigDecimal n2=BigDecimal.valueOf(m);
      BigDecimal i=BigDecimal.valueOf(2);
      BigDecimal s=n1.multiply(n2);
      s=s.divide(i);
      System.out.println(s);
    }
}
