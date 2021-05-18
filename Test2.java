 import java.util.Scanner;

 public class Test2 {
 
     public static void main(String[] args) {
         // TODO Auto-generated method stub
        String name;
        double sum=0,score;
        double avg=0;
         System.out.println("请输入姓名：");
         
         Scanner input= new Scanner(System.in);
         name=input.next();
         //System.out.println(name);
        for(int i=1;i<=5;i++){
             System.out.print("请输入5门功课的第"+i+"门功课的成绩:");
            
            Scanner input2=new Scanner(System.in);
             score=input2.nextDouble();
             sum=sum+score;
         }
         avg=sum/5;
         System.out.println(name+"的平均分是:"+avg);
     }
 }
