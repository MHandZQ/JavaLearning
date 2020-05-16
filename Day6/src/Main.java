/*
接口实现计算税收
 */

//接口Income，里面定义了getTax的抽象方法
interface Income{
    double getTax();
}

class SalaryIncme implements Income{//SalaryIncme类实现Income接口
    private double income;

    public SalaryIncme(double income){this.income = income;}//构造方法

    @Override
    public double getTax() {//接口方法重写
        return income*0.1;
    }
}

class RoyaltyIncome implements Income{//RoyaltyIncome类实现Income接口
    private double income;

    public RoyaltyIncome(double income){this.income = income;}//构造方法

    @Override
    public double getTax() {//接口方法重写
        return income*0.2;
    }
}

public class Main {
    public static void main(String[] args) {
        //Income类型数组，数组元素是各子类实例，这里就是多态的体现。incomes是Income接口类型，实际类型是SalaryIncme和RoyaltyIncome
        //调用getTax()方法时,会根据实际类型调用给子类中的getTax
        Income[] incomes = new Income[]{
                new SalaryIncme(2000),
                new RoyaltyIncome(1000)
        };
        System.out.println(totalTax(incomes));
    }

    //调用实例方法必须通过一个实例变量，而调用静态方法则不需要实例变量，通过类名就可以调用
    public static double totalTax(Income... incomes) {//定义计算总税收的方法，必须是静态方法，传入Income类型的多个参数
        double total = 0;
        for (Income income : incomes) {//for each循环,遍历参数数组
            total = total + income.getTax();
        }
        return total;
    }
}
