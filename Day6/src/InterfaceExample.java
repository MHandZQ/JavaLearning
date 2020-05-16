/*
熟悉接口
是比抽象类还要抽象的纯抽象接口
1.它没有字段。定义的所有方法都默认是public abstract的，可以不加这两个关键字
2.一个类只能有一个父类，但是却可以有多个接口
3.接口与接口之间也是可以继承的
4.在接口中，可以定义default方法
5.接口类型变量可以指向实现它的子类实例，向上转型，其实就是多态的体现
 */

interface Person{//接口Person,两个抽象类方法
    void run();
    String getName();
    default void play(){//default方法，类实现接口时可以不必覆写default方法。
        System.out.println(getName()+",play");
    }
}

interface Hello{//接口Hello，一个抽象方法
    void hello();
}

interface PrimaryStudent extends Person{//接口PrimaryStudent继承了Person，所以这个接口实际上有三个抽象方法
    void jump();
}

class Student implements Person,Hello{//Student类同时调用两个接口，调用接口后必须Override
    private String name;

    public Student(String name){//定义自己的方法
        this.name = name;
    }

    @Override
    public void run() {//重写Person接口中的run方法
        System.out.println("MH.run");
    }

    @Override
    public String getName() {//重写Person接口中的getName方法
        return this.name;
    }

    @Override
    public void hello() {//重写Hello接口中的hello方法
        System.out.println("Hello,"+this.name);
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        Student s = new Student("孟行");
        Person p = new Student("周琪");//接口变量p可以指向实现它的子类实例，向上转型。其实就是多态的体现
        p.getName();//这样p就可以调用Person接口中定义的方法，不能调用Hello接口中的方法
        System.out.println(s.getName());
        s.hello();
        s.run();
        s.play();
    }
}
