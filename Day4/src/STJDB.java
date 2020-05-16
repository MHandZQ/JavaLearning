/*
用来熟悉switch语句
jdk14开始case:   用    case->代替
switch语句可以不再用break
 */
import java.util.Scanner;
import java.util.Random;//Random类，用来产生伪随机数

public class STJDB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();//创建Random对象rand
        System.out.println("****************本程序实现石头剪刀布游戏***************");
        System.out.println("请你出拳,1代表石头，2代表剪刀，3代表布，输入end结束游戏");
        while (scan.hasNextInt()) {
            int computer = rand.nextInt(3) + 1;
            //rand.nextInt(3)用来产生[0,3)之间的随机数，再加上1,就实现产生[1,4)之间的随机数，即随机数在生1，2，3中产生
            int mine = scan.nextInt();
            switch (mine) {
                case 1 -> {
                    if (computer == 1)
                        System.out.println("电脑出石头，你出石头，平局。");
                    if (computer == 2)
                        System.out.println("电脑出剪刀，你出石头，你赢啦！");
                    if (computer == 3)
                        System.out.println("电脑出布，你出石头，你输了...");
                }
                case 2 -> {
                    if (computer == 1)
                        System.out.println("电脑出石头，你出剪刀，你输了...");
                    if (computer == 2)
                        System.out.println("电脑出剪刀，你出剪刀，平局。");
                    if (computer == 3)
                        System.out.println("电脑出布，你出剪刀，你赢了！");
                }
                case 3 -> {
                    if (computer == 1)
                        System.out.println("电脑出石头，你出布，你赢了！");
                    if (computer == 2)
                        System.out.println("电脑出剪刀，你出布，你输了...");
                    if (computer == 3)
                        System.out.println("电脑出布，你出布，平局");
                }
                default -> System.out.println("请正确出拳");
            }
        }
    }
}
