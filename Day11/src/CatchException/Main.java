/*
Java异常捕获
1.在Java中，凡是可能抛出异常的语句，都可以用try ... catch捕获。
把可能发生异常的语句放在try { ... }中，然后使用catch捕获对应的Exception及其子类。
2.在方法定义的时候，使用throws Xxx表示该方法可能抛出的异常类型。调用方在调用的时候，必须强制捕获这些异常，否则编译器会报错。
String.getBytes(String)方法定义是：
public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
    ...
}
在toGBK()方法中，因为调用了String.getBytes(String)方法，就必须捕获UnsupportedEncodingException。
 */

package CatchException;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }

    static byte[] toGBK(String s){//toGBK方法，返回byte[]数组
        try {
            return s.getBytes("GBK");//用指定编码转换String为byte[],可以指定编码，如果不指定按默认编码
        }catch (UnsupportedEncodingException e){//捕获异常
            // 如果系统不支持GBK编码，会捕获到UnsupportedEncodingException:
            System.out.println(e);//打印异常信息
            return s.getBytes();//尝试使用默认编码
        }
    }
}

