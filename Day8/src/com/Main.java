/*
仿造StringBuilder的链式操作，设计一个累加器Adder
 */

package com;

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.sum(2)
                .sum(3)
                .sum(4)
                .inc()
                .sum(5);
        System.out.println(adder.show());
    }
}


class Adder {
    private int sum = 0;
    private String name = "我到要看看返回的是什么";

    public Adder sum(int x) {//定义了一个返回类型为类名的sum方法，返回的是Adder类中的字段：sum和name
        sum = sum + x;
        return this;
    }

    public Adder inc() {//定义了一个返回类型为类名的sum方法，返回的是Adder类中的字段：sum和name
        sum++;
        return this;
    }

    public int show(){//返回累加值
        return sum;
    }
}