package rectAreaIntersect;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      @SuppressWarnings("resource")
    Scanner scn =new Scanner(System.in);
      while(scn.hasNext()){
          double []rectang1=new double[4];
          double []rectang2=new double[4];
          for (int i = 0; i < rectang1.length; i++) {
            rectang1[i]=scn.nextDouble();
          }
          for (int i = 0; i < rectang2.length; i++) {
            rectang2[i]=scn.nextDouble();
        }
          //确定矩形左下角及右上角顶点坐标
          double []rect1=new double[4];
          rect1[0]=Math.min(rectang1[0], rectang1[2]);
          rect1[1]=Math.min(rectang1[1], rectang1[3]);
          rect1[2]=Math.max(rectang1[0], rectang1[2]);
          rect1[3]=Math.max(rectang1[1], rectang1[3]);
          //确定矩形左下角及右上角顶点坐标
          double []rect2=new double[4];
          rect2[0]=Math.min(rectang2[0], rectang2[2]);
          rect2[1]=Math.min(rectang2[1], rectang2[3]);
          rect2[2]=Math.max(rectang2[0], rectang2[2]);
          rect2[3]=Math.max(rectang2[1], rectang2[3]);
          //假设两矩形有相交的部分，则确定相交矩形的左下角及右上角坐标
          double []rect=new double[4];
          rect[0]=Math.max(rect1[0], rect2[0]);
          rect[1]=Math.max(rect1[1], rect2[1]);
          rect[2]=Math.min(rect1[2], rect2[2]);
          rect[3]=Math.min(rect1[3], rect2[3]);
          //判断两矩形是否相交，相交时输出面积，未相交时输出相交面积值为0
          DecimalFormat dc=new DecimalFormat("0.00");
          double area=0;
          if(rect[0]>rect[2]||rect[1]>rect[3]){
              System.out.println(dc.format(area));
          }else{
              area=(rect[2]-rect[0])*(rect[3]-rect[1]);
              System.out.println(dc.format(area));
          }          
      }      
    }
}
