/*
java.math.BigInteger就是用来表示任意大小的整数。BigInteger内部用一个int[]数组来模拟一个非常大的整数

 */

package BigInteger;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger("123456789");
        System.out.println(bi.pow(5));
        BigInteger bi1 = new BigInteger("123456789");
        BigInteger bi2 = new BigInteger("987654321");
        System.out.println(bi1.add(bi2));//对BigInteger做运算的时候，只能使用实例方法
        BigInteger bi3 = new BigInteger("123456789000");
        System.out.println(bi3.longValue());//把BigInteger转换成long型
        //System.out.println(bi3.pow(10).longValueExact());//使用longValueExact()方法时，如果超出了long型的范围，会抛出ArithmeticException
        System.out.println(bi3.pow(99).floatValue());//Infinity
    }
}
