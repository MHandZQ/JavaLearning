class Person{
    String name;//成员变量（字段），default权限
    int age;//成员变量（字段），default权限
    public void get(){//成员函数（方法）
        System.out.print("姓名："+name+"，年龄："+age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person per = new Person();//定义Person类的对象per，实例化Person类
        //同一个包下，一个类可以访问另一个类的default及以下权限
        per.name = "张三";
        per.age = 23;
        per.get();
        //同一个包下，一个类不可以直接访问另一个类
        //name = "张三";
        //age = 23;
        //get();
    }
}