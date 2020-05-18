/*
熟悉枚举类型
1.enum是一个class，每个枚举的值都是class的实例
2.使用enum定义的枚举类是一种引用类型。
引用类型比较，要使用equals()方法，如果使用==比较，它比较的是两个引用类型的变量是否是同一个对象。
因此，引用类型比较，要始终使用equals()方法，但enum类型可以例外。
这是因为enum类型的每个常量在JVM中只有一个唯一实例，所以可以直接用==比较：
 */

package ENUM;

public class Main {
    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.MON;//WeekDay类型的变量weekDay，赋值为WeekDay.MON
        if(weekDay==WeekDay.SAT||weekDay==WeekDay.SUN){//也可以写成if(weekDay.equals(WeekDay.SAT||weekDay.equals(WeekDay.SUN))
            System.out.println("work at home");
        }else{
            System.out.println("work at office");
        }
        //enum是一个class，每个枚举的值都是class的实例,所以也就有一系列方法
        System.out.println(WeekDay.SUN.name());//name()返回常量名
        System.out.println(WeekDay.SUN.ordinal());//ordinal()返回索引值
    }
}

enum WeekDay{//WeekDay类型的枚举值集合
    SUN,MON,TUE,WED,THU,FRI,SAT;
}

enum Color{
    RED,GREEN,BLUE;
}