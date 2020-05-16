/*
熟悉抽象类
抽象类中有字段
抽象类中的方法都是抽象的，没有具体执行代码
 */
abstract class Incomes{//抽象类
    protected  double income;//字段

    public Incomes(double income){//构造方法
        this.income = income;
    }

    public abstract double getTax();//抽象方法，没有具体执行代码
}

class WriteIncome extends Incomes{//子类WriteIncome继承Incomes
    public WriteIncome(double income){//子类构造方法
        super(income);
    }

    @Override
    public double getTax(){//必须重写父类中的抽象方法
        return income*0.2;
    }
}

public class AbsractClass {
    public static void main(String[] args) {
        Incomes inc = new WriteIncome(2000);//inc时引用类型为Incomes,实际类型为WriteIncome的变量。多态性
        System.out.println(inc.getTax());
    }
}
