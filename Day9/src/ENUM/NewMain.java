package ENUM;

public class NewMain {
    public static void main(String[] args) {
        WeekDays weekDay = WeekDays.SUN;
        if(weekDay.dayvalue==6||weekDay.dayvalue==0) {
            System.out.println("today is "+weekDay+" work at home");
 //system.out.println本质上调用的是class 的 toString()方法，在class 重写了 toString()方法，所以导致返回的是chinese，也就是第二个参数。
 //这里实际上时System.out.println("today is "+weekDay.toString()+" work at hone");
        }else{
            System.out.println("today is "+weekDay+" work at office");
        }
        System.out.println(WeekDay.SUN.name());//name()返回常量名
        System.out.println(WeekDay.SUN.ordinal());//ordinal()返回索引值
    }
}


enum WeekDays{

    MON(1,"星期一"),TUE(2,"星期二"),WED(3,"星期三"),
    THU(4,"星期四"),FRI(5,"星期五"),SAT(6,"星期六"),SUN(0,"星期天");

    public final int dayvalue;
    private final String chinese;

    private WeekDays(int dayvalue,String chinese){//private构造方法，外部使用时无法用new创建实例
        this.dayvalue = dayvalue;
        this.chinese = chinese;
    }

    @Override
    public String toString(){
        return this.chinese;
    }
}