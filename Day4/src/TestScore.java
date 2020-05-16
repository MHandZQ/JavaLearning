/*
请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。
 */

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double prescore = 0;
        double nowscore = 0;
        System.out.println("请输入上一次的成绩：");
        if(scan.hasNextInt()){
            prescore = scan.nextInt();
            System.out.println("请输入这一次的成绩：");
            nowscore = scan.nextInt();
        }
        double result = (nowscore-prescore)/prescore*100;
        System.out.printf("成绩提高的百分比为%.2f%%",result);//在“ ”中打印处%要使用转义符%，所以%%打印百分号。result会出现在%.2f的位置
    }
}
