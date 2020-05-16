/*
用来熟悉类与对象
构造方法
方法重载（一个类中的多态性）
继承
多态
 */

class Person{
    protected String name;//成员变量，访问权限是protected，仅父类和其子类可以访问。
    protected int age;

    public Person(String name,int age){//构造方法
        this.name = name;
        this.age = age;
    }

    public void setName(String name){//成员函数
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    //在父类Person中定一个run函数，来验证多态
    public void run(){
        System.out.println("person.run");
    }

    //TODO:这是方法重载，也是run函数，但是方法参数不同相同或方法返回值不同或都不同
    public void run(String str){
        System.out.println("str");
    }
}

class Student extends Person{//子类Student继承父类Person
    protected int score;

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore(){
        return this.score;
    }

    public Student(String name,int age,int score){//子类构造方法
        //如果父类没有默认构造方法，必须用super(),加入相应参数以便找到父类中对应的构造方法。
        //如果父类是默认构造方法，可以不用加super(),编译器会帮我们自动加一句super();
        super(name, age);
        this.score = score;
    }

    //在子类Student中也定义一个run函数，与父类的函数一样：方法名相同，方法参数相同，方法返回值相同。
    //TODO:这就是方法覆写
    public void run(){
        System.out.println("student.run");
    }
}

class PrimaryStudent extends Student{//子类PrimaryStudent继承Student
    private String grade;

    public PrimaryStudent(String name,int age,int score,String grade){//构造方法
        super(name,age,score);
        this.grade = grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade(){
        return this.grade;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("小明", 12);
        Student s = new Student("小红", 20, 99);
        // TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
        Student ps = new PrimaryStudent("小军", 9, 100, "五年级");
        System.out.println(ps.getScore());
        //向上转型，per是一个实际类型为Student，引用类型为Person的变量。这样是可以的，因为子类有所有父类的功能。
        Person per = new Student("ZQ",23,89);
        //这里就有一个问题，per是一个实际类型为Student，引用类型为Person的变量，在Person类和Student类中都定义了run函数
        //那执行下面的代码会调用哪一个函数呢？
        per.run();
        //执行后发现是执行Student类中的run方法。所以Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。
    }
}

