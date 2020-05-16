import java.util.Scanner;

public class Rooting {
    public static void main(String[] args) {
        System.out.println("************本程序用来计算一元二次方程ax2+bx+c=0的根***************");
        System.out.println("请依次输入一元二次方程对应的系数值：");
        double a = 0;
        double b = 0;
        double c = 0;
        Scanner scan = new Scanner(System.in);//创建Scanner类的对象scan

        if (scan.hasNextDouble()) {//判断输入的值是否是double类型
            a = scan.nextDouble();//获取用户输入值依次赋给a，b，c
            b = scan.nextDouble();
            c = scan.nextDouble();
        }
        double temp  = b*b-4*a*c;
        if(temp<0){
            System.out.print("方程无解");
        }else{
            double x1 = 0;
            double x2 = 0;
            x1 = (-b + Math.sqrt(temp))/2*a;//Math.sqrt()中的参数类型要求是double
            x2 = (-b - Math.sqrt(temp))/2*a;
            System.out.println("此方程的解为：x1="+x1+",x2="+x2);
        }
    }
}
