/*
在Java中，并没有无符号整型（Unsigned）的基本数据类型
无符号整型和有符号整型的转换在Java中就需要借助包装类型的静态方法完成
byte是有符号整型，范围是-128~+127
如果把byte看作无符号整型，它的范围就是0~255
因为byte的-1的二进制表示是11111111，以无符号整型转换后的int就是255
 */

package Unsigned_Integer;

public class Main {
    public static void main(String[] args) {
        byte x = -1;
        byte y = 127;
        System.out.println(Byte.toUnsignedInt(x));//255
        System.out.println(Byte.toUnsignedInt(y));//127
    }
}
