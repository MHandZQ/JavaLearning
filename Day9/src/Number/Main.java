/*
所有的整数和浮点数的包装类型都继承自Number
根据多态，通过父类Number可以非常方便地直接通过包装类型获取各种基本类型
 */

package Number;

public class Main {
    public static void main(String[] args) {
        // 向上转型为Number:
        Number num = new Integer(999);
        // 获取byte, int, long, float, double:
        byte b = num.byteValue();//-25
        System.out.println(b);
        int n = num.intValue();//999
        System.out.println(n);
        long ln = num.longValue();//999
        System.out.println(ln);
        float f = num.floatValue();//999.0
        System.out.println(f);
    }
}
