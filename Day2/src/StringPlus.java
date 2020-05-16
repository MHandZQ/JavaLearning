/*
用来理解字符串的连接
 */

public class StringPlus {
    public static void main(String[] args) {
        int a = 72;//a,b,c这里都是整型
        int b = 105;
        int c = 65281;
        String str = " "+a+b+c;//在前面加一个空格的字符串，这样就是字符串连接，字符串连接时，首先将整型a,b,c转换成字符串类型
        System.out.println(str);//输出的结果就是字符串的简单连接7210565281
    }
}
