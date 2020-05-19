/*
BigDecimal可以表示一个任意大小且精度完全准确的浮点数。
 */
package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal("123.456789");
        System.out.println(bd.multiply(bd));//15241.578750190521
        System.out.println(bd.scale());//scale()表示小数位数,6
        BigDecimal d1 = new BigDecimal("123.4500");
        BigDecimal d2 = d1.stripTrailingZeros();
        System.out.println(d1.scale()); // 4
        System.out.println(d2.scale()); // 2,因为去掉了00

        BigDecimal d3 = new BigDecimal("1234500");
        BigDecimal d4 = d3.stripTrailingZeros();
        System.out.println(d3.scale()); // 0
        System.out.println(d4.scale()); // -2

        BigDecimal d5 = bd.setScale(4, RoundingMode.HALF_UP); // 四舍五入，123.4568
        System.out.println(d5);
        BigDecimal d6 = bd.setScale(4, RoundingMode.DOWN); // 直接截断，123.4567
        System.out.println(d6);

        BigDecimal d7 = bd.divide(d1,10,RoundingMode.HALF_UP);// 保留10位小数并四舍五入
        System.out.println(d7);
        //System.out.println(bd.divide(d1));//报错，除不尽

        BigDecimal n = new BigDecimal("12.345");
        BigDecimal m = new BigDecimal("0.12");
        BigDecimal[] dr = n.divideAndRemainder(m);
        System.out.println(dr[0]); // 整数部分：102
        System.out.println(dr[1]); // 余数部分：0.105
    }
}
