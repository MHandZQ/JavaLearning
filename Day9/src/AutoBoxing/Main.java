/*
把int变为Integer的赋值写法，称为自动装箱（Auto Boxing）
把Integer变为int的赋值写法，称为自动拆箱（Auto Unboxing）
 */

package AutoBoxing;

import javax.lang.model.type.NullType;

public class Main {
    public static void main(String[] args) {
        /*
        Integer n1 = 100;//把int变为Integer的赋值写法，称为自动装箱（Auto Boxing）
        int n2 = n1.intValue();//把Integer变为int的赋值写法，称为自动拆箱（Auto Unboxing）
        System.out.print(n2);
         */

        //NullPointerException
        Integer n1 = null;
        int n2 = n1.intValue();
        //此时会报错：Exception in thread "main" java.lang.NullPointerException
    }
}
