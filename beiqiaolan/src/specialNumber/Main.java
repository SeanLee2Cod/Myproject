package specialNumber;

public class Main {

    public static void main(String[] args) {
      for (int i = 1; i < 10; i++) {
          for (int j = 0; j < 10; j++) {
            for (int j2 = 0; j2 < 10; j2++) {
                if((i*100+j*10+j2)==i*i*i+j*j*j+j2*j2*j2){
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(j2);
                    System.out.println();
                }
             }
          }
       }
    }
 }
