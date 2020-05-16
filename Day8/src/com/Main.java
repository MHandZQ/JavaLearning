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

    public Adder sum(int x) {
        sum = sum + x;
        return this;
    }

    public Adder inc() {
        sum++;
        return this;
    }

    public int show(){
        return sum;
    }
}