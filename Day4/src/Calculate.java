/*
用于计算前n个数的累加值
同时学习用Scanner类实现获取键入值
 */

import java.util.Scanner;

public class Calculate{
    public static void main(String[] args) {
        System.out.println("***************本程序用于计算前n个数的累加值**************");
        System.out.println("请输入n:");
        int n = 0;
        Scanner scan = new Scanner(System.in);//创建Scanner类的对象scan
        if(scan.hasNextInt()){//判断输入的值是否是int类型
            n = scan.nextInt();//获取用户输入值
        }else{
            System.out.println("输入的不是整数");
        }
        int sum = (1+n)*n/2;//前n个数的求和公式
        System.out.println("前n个数之和为："+sum);
    }
}