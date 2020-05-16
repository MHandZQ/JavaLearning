/*
用来探究四种不同的访问权限：private、default、protected、public

四个类的结构如下:
AClass 和BClass 是同包的类，
CClass 和DClass是同包的类，
CClass 继承了AClass。

AClass中定义了四个不同访问权限的字段
    private int a1 = 10;
    int a2 = 20;
    protected int a3 = 30;
    public int a4 = 40;

还定义了四个不同访问权限的方法
    private void showA1(){System.out.println("a1");}
    void showA2(){System.out.println("a2");}
    protected void showA3(){System.out.println("a3");}
    public void showA4(){System.out.println("a4");}

结论：
1.BClass类是不能直接访问AClass类的成员的，但通过实例化对象的方法可以访问default权限以下（default、protected、public）的成员。

 */