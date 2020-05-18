/*
基本数据类型与引用类型的转换
 */

package Inter;

public class Main{
public static void main(String[] args) {
        int i =100;
        //通过new操作符创建Ineger实例
        Integer n1 = new Integer(i);
        System.out.println(n1.intValue());
        //通过静态方法valueOf(int)创建Integer实例
        Integer n2 = Integer.valueOf(i);
        System.out.println(n2.intValue());
        //通过静态方法valueOf(String)创建Integer实例
        Integer n3 = Integer.valueOf("100");
        System.out.println(n3.intValue());
    }
}