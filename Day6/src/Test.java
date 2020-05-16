/*
用来测试
 */

import java.util.Scanner;

class Persons{
    protected String name;//成员变量
    protected int age;

    public Persons(String name,int age){//构造方法
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
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

    public String hello(){
        return "Hello,"+name;
    }
}

class Students extends Persons{
    private int score;

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore(){
        return this.score;
    }

    public Students(String name,int age,int score){
        super(name,age);
        this.score = score;
    }

    public String hello(){
        return super.hello();
    }
}

public class Test {
    public static void main(String[] args) {
        Students p = new Students("MH",23,88);
        System.out.println(p.hello());
    }
}
