/*
用于计算用户任意输入值的平均值
用while循环实现用户任意数据读取
 */
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("***********本程序用于计算键入值的平均值***************");
        System.out.println("每次输入值后回车再输入下一个值，并键入end结束即可得到平均值");
        System.out.println("请输入数值：");
        float sum = 0;
        int n = 0;//n用来计数，统计用户共输入了几个数
        Scanner scan = new Scanner(System.in);//创建Scanner类的对象scan
        while(scan.hasNextFloat()){//判断输入的值是否是float类型
            n = n+1;
            float temp = scan.nextFloat();//获取用户输入值
            sum = sum+temp;
        }
        System.out.println("输入的"+n+"个数的平均值为"+sum/n);
    }
}
