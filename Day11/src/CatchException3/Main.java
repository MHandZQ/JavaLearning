/*
因为main()方法声明了可能抛出Exception，也就声明了可能抛出所有的Exception，因此在内部就无需捕获了。
代价就是一旦发生异常，程序会立刻退出。
 */

package CatchException3;

import java.util.Arrays;
import java.io.UnsupportedEncodingException;

public class Main{
    public static void main(String[] args) throws Exception {//如果不想写任何try代码，可以直接把main()方法定义为throws Exception
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }

    static byte[] toGBK (String s)throws UnsupportedEncodingException{//toGBK方法，返回byte[]数组
        return s.getBytes("GBK");//用指定编码转换String为byte[]
    }
}
