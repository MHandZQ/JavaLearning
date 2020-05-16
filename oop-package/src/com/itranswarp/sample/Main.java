/*
如果有两个class名称相同，例如com.itranswarp.xiaoming.Person和com.itranswarp.xiaohong.Person，
那么只能import其中一个，另一个必须写完整类名。
 */

package com.itranswarp.sample;
import com.itranswarp.xiaoming.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.xiaoming();

        com.itranswarp.xiaohong.Person s = new com.itranswarp.xiaohong.Person();
        s.xiaohong();
    }
    public void hello(){System.out.println("package com.itranswarp.sample  Main.java");}
}
