/*
用StringBuilder连接字符串
进行链式操作的关键是：定义的append()方法会返回this，这样，就可以不断调用自身的其他方法。
 */

package http;

public class Main {
    public static void main(String[] args) {
        var sb = new StringBuilder(1024);//预分配缓冲区
        sb.append("Mr ")//链式操作
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sb.toString());
    }
}
