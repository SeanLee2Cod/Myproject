package binaryString;

public class Main {

    public static void main(String[] args) {
     char a[]={'0','0','0','0','0'};
     for (int i = 0; i < 32; i++) {
         for (int j = 0; j < a.length; j++) {
             System.out.print(a[j]);
          }
             System.out.println();
         //每次加1，依次递增
        a[4]+=1;
        //逢二进一
        if(i!=31){
        for (int j = 4; j >= 0; j--){
            if(a[j]=='2'){
              a[j-1]+=1;
              a[j]='0';
           }
         }
       }
     }
  }
}
