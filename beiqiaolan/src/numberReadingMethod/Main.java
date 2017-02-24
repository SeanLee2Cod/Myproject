package numberReadingMethod;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        //四位数一组划分，最多三组，对应数组中有四个元素（对应最大数组下标为3）
        String[] big={"","","wan ","yi "};
        //每一组数含有四位数，对应数组有五个元素
        String[] small={"","","shi ","bai ","qian "};
        //作为结果的存储容器
        StringBuffer sb=new StringBuffer();
        while(scn.hasNext()){
          String str=scn.next();
          char[] cha=str.toCharArray();
          //将输入的数分为group组
          int group=(cha.length-1)/4+1;
          //因为数的最前面两位与其他的读法有差异，故需要拿出来
          int rest=cha.length%4;
          String readNum;
          int index=0;
          //设置状态记录，选出非零数字前有零出现的情况
          boolean flag=true;
          //将十位是1的情况单独拿出来考虑
          if(rest!=0){
          for(int i=rest; i>0; i--){
              if(i==2){
                  if(cha[index]=='1'){
                    sb.append(small[i]); 
                  }
                  else{
                      //如果出现首字母是零的数字串，直接结束程序
                      if(cha[index]=='0'){
                          return;
                      }else{
                         //由于此时该数字不可能为零，故不需要讨论
                         readNum=charToNumRead(cha[index]);
                         sb.append(readNum+" "+small[i]);
                        }
                      }
                 index++;
              }else{
                  if(cha[index]!='0'){
                    //如果该数位不为零，而且前一个不为零  
                      if(flag){
                          readNum=charToNumRead(cha[index]);
                          sb.append(readNum+" "+small[i]);
                      }else{
                    //如果该数位不为零，而且前一个为零
                          readNum=charToNumRead(cha[index]);
                          sb.append("ling"+" "+readNum+" "+small[i]);
                          flag=true;
                      }
                    //如果该数位为零，则记录下该状态，且不做其他的工作
                  }else{
                      flag=false;
                  }
                  index++;
              }
          }
          //将“yi”,“wan”加入字符串
          sb.append(big[group--]);
         }
          flag=true;
          for(int i=group;i>0;i--){
            for(int j=4; j>0; j--){
                if(cha[index]!='0'){
                    if(flag){
                        readNum=charToNumRead(cha[index]);
                        sb.append(readNum+" "+small[j]);
                    }else{
                        readNum=charToNumRead(cha[index]);
                        sb.append("ling"+" "+readNum+" "+small[j]);
                        flag=true;
                    }
                }else{
                    flag=false;
                }
                index++;
            }
            if(sb.indexOf("yi ")!=sb.capacity()-3){
             sb.append(big[i]);
            }
          }
          System.out.println(sb.toString());
        } 
    }
    //将除零以外的数字字符对应为读音字符串
    public static String charToNumRead(char c) {
        switch(c){
        case '1':  return "yi";
        case '2':  return "er";   
        case '3':  return "san";   
        case '4':  return "si";   
        case '5':  return "wu";   
        case '6':  return "liu";   
        case '7':  return "qi";   
        case '8':  return "ba";   
        default:   return "jiu";   
        
        }
    }

}
