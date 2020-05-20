package Practice2;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(tax(2000, 0.1));
            System.out.println(tax(-200, 0.1));
            System.out.println(tax(2000, -0.1));
        } catch (IllegalArgumentException e) {//捕获IllegalArgumentException异常
            e.printStackTrace();//打印异常栈
        }
    }

    static double tax(int salary, double rate) {
        // TODO: 如果传入的参数为负，则抛出IllegalArgumentException
        if (salary < 0 || rate < 0) {
            throw new IllegalArgumentException();
        }
        return salary * rate;
    }
}