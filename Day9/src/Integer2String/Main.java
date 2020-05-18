/*
Integer与String相互转换
 */

package Integer2String;

public class Main {
    public static void main(String[] args) {
        //String to Integer
        System.out.println(Integer.parseInt("100"));//100
        System.out.println(Integer.parseInt("100",16));//256,按16进制解析

        //Integer to String
        System.out.println(Integer.toString(100));//100
        System.out.println(Integer.toString(100,36));//2s,按36进制解析
        System.out.println(Integer.toBinaryString(100));//1100100
        System.out.println(Integer.toHexString(100));//64.按16进制解析
        System.out.println(Integer.toOctalString(100));//144,按8进制解析
    }
}
