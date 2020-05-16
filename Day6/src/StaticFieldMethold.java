/*
静态字段与静态方法
推荐用：类名.静态字段   来访问静态字段
 */

class Human{
    public String name;
    public int age;

    public static int number;//静态字段

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StaticFieldMethold {
    public static void main(String[] args) {
        Human ming = new Human("Xiao Ming", 12);
        Human hong = new Human("Xiao Hong", 15);
        ming.number = 88;//推荐用Human.number=88
        System.out.println(hong.number);//输出是88
        hong.number = 99;//推荐用Human.number=99
        System.out.println(ming.number);//输出是99
    }
}
