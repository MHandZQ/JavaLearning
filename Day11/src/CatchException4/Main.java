/*
所有异常都可以调用printStackTrace()方法打印异常栈
 */

package CatchException4;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }

    static byte[] toGBK(String s){
        try {
            return s.getBytes("GBK");
        }catch (UnsupportedEncodingException e){//捕获异常
            e.printStackTrace();//不打印信息，但记录下来。所有异常都可以调用printStackTrace()方法打印异常栈
        }
        return null;
    }
}
