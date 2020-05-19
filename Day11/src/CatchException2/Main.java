/*
String.getBytes(String)方法定义中声明了checked exception：UnsupportedEncodingException
所以在toGBK()方法中，因为调用了String.getBytes(String)方法，就必须捕获UnsupportedEncodingException，否则就会报错
现在在toGBK()方法中声明了UnsupportedEncodingException，不捕获也不会报错
但是在main中调用了toGBK()就必须捕获
可见，只要是方法声明的Checked Exception，不在调用层捕获，也必须在更高的调用层捕获。
所有未捕获的异常，最终也必须在main()方法中捕获，不会出现漏写try的情况。
 */

package CatchException2;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            byte[] bs = toGBK("中文");
            System.out.println(Arrays.toString(bs));
        }catch (UnsupportedEncodingException e){//捕获异常
            System.out.println(e);
        }
    }

    static byte[] toGBK(String s)throws UnsupportedEncodingException {//toGBK方法，返回byte[]数组
        return s.getBytes("GBK");//用指定编码转换String为byte[]
    }
}
