package Switch_enum;

public class Main {
    public static void main(String[] args) {
        WeekDay day = WeekDay.SUN;
        switch (day){
            case SUN -> System.out.println("work at home");
            case SAT -> System.out.println("work at home");
            default -> System.out.println("work at office");
        }
    }
}


enum WeekDay{//WeekDay类型的枚举值集合
    SUN,MON,TUE,WED,THU,FRI,SAT;
}