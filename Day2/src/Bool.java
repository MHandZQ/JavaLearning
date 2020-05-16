/*
用来熟悉布尔运算中的三元运算
 */

import java.util.Scanner;

public class Bool {
    public static void main(String[] args) {
        System.out.println("****************本程序用来判断用户输入年龄是否是小学生(6岁-12岁)*****************");
        Scanner scan = new Scanner(System.in);//创建Scanner类的对象scan
        if(scan.hasNextInt()){//判断输入的值是否是int类型
            int age = scan.nextInt();//获取用户输入值
            boolean YorN = age>=6&&age<=12;
            System.out.println(YorN?"Yes":"No");//三元运算b?x:y。b为true输出x，flase输出y
        }
    }
}

