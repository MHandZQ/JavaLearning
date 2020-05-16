package test1;

public class BClass {
    public void show() {
        //第一方法通过实例化一个AClass类对象aClass对成员变量及方法进行访问，第二种是BClass直接访问AClass中的成员
        AClass aClass = new AClass();
        //对方法的访问
        aClass.showA1();//showA1修饰符是private,拥有同类访问权，同包但是不同类,不能访问
        aClass.showA2();//showA2修饰符是default,拥有同包以上访问权，同包但是不同类,可以访问
        aClass.showA3();//showA3修饰符是protected,拥有不同包子类以上访问权，同包但是不同类,可以访问
        aClass.showA4();//showA4修饰符是public,拥有公开访问权，同包但是不同类,可以访问

        showA1();//showA1修饰符是private,拥有同类访问权，同包但是不同类,不能访问
        showA2();//showA2修饰符是default,拥有同包以上访问权
        showA3();//showA3修饰符是protected,拥有不同包子类以上访问权
        showA4();//showA4修饰符是public,拥有公开访问权

        //对字段访问
        System.out.println(aClass.a1);//a1修饰符是private,拥有同类访问权，同包但是不同类,不能访问
        System.out.println(aClass.a2);//a2修饰符是default,拥有同包以上访问权，同包但是不同类,可以访问
        System.out.println(aClass.a3);//a3修饰符是protected,拥有不同包子类以上访问权，同包但是不同类,可以访问
        System.out.println(aClass.a4);//a4修饰符是public,拥有公开访问权，同包但是不同类,可以访问

        System.out.println(a1);//a1修饰符是private,拥有同类访问权，同包但是不同类,不能访问
        System.out.println(a2);//a2修饰符是default,拥有同包以上访问权
        System.out.println(a3);//a3修饰符是protected,拥有不同包子类以上访问权
        System.out.println(a4);//a4修饰符是public,拥有公开访问权
    }
}
