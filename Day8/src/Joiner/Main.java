package Joiner;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Bob","Alice","Grace"};
        var sj = new StringJoiner(",","Hello ","!");//不仅可以用分隔符拼接数组，还可以指定开头和结尾
        for(String name:names){
            sj.add(name);
        }
        System.out.println(sj.toString());//输出Hello Bob,Alice,Grace!
    }
}
