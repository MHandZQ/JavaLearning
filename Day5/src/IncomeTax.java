/*
用来熟悉方法覆写
父类与子类的多态性
 */

class Income{//父类Income
    protected double income;

    public Income(double income){//构造方法
        this.income = income;
    }

    public double getTax(){
        return income*0.1;
    }
}

class SalaryIncome extends Income{//子类SalaryIncome继承Income

    public SalaryIncome(double income){//子类构造方法，因为父类没有默认构造方法，所以必须用super()
        super(income);
    }

    @Override
    public double getTax(){//方法覆写
        if(income<=5000){
            return 0;
        }
        return (income-5000)*0.2;
    }
}

class StateCouncilAllowance extends Income{//子类StateCouncilAllowance继承Income

    public StateCouncilAllowance(double income){//子类构造方法，因为父类没有默认构造方法，所以必须用super()
        super(income);
    }

    @Override
    public double getTax(){//方法覆写
        return 0;
    }
}

class RoyaltyIncome extends Income{
    public RoyaltyIncome(double income){
        super(income);
    }

    @Override
    public double getTax(){
        return income*0.2;
    }
}

public class IncomeTax {
    //必须是静态方法，要不然在main函数中找不到这个方法
    //调用实例方法必须通过一个实例变量，而调用静态方法则不需要实例变量，通过类名就可以调用
    public static double totalTax(Income... incomes){//可变参数，可传入人一个参数：变量类型是Income,变量名是incomes。可以看成把参数放入incomes的数组中
        double total = 0;
        for(Income income:incomes){//for each循环，遍历incomes数组中的参数
            total = total+income.getTax();
        }
        return total;
    }

    public static void main(String[] args) {
        //这里是多态的表现，引用类型都是Income，但实际类型有Income，SalaryIncome以及StateCouncilAllowance,即前面所讲的向上转型
        //所以当调用getTax()函数时，会根据实际类型调用不同类中的getTax()
        Income[] incomes = new Income[]{//Income类型的数组，数组元素是以上类的实例
                new Income(3000),
                new SalaryIncome(7500),
                new StateCouncilAllowance(15000),
                new RoyaltyIncome(2000)
        };
        System.out.println(totalTax(incomes));
    }
}
