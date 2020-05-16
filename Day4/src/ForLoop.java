/*
熟悉for loop以及for each遍历打印数组
 */

class ForLoop1{
    public void printarray(int[] array){
        for(int i= 0;i<array.length;i++){
            System.out.print(""+array[i]+"    ");
        }
        System.out.print("\n");
    }
}

class ForEach{
    public void printarray(int[] array){
        for(int i:array){
            System.out.print(""+i+"    ");
        }
    }
}

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("本程序用来熟悉for loop以及for each打印数组");
        ForLoop1 forloop1 = new ForLoop1();
        ForEach foreach = new ForEach();
        int[] ns = {1,2,3,4,5};
        System.out.println("for loop遍历打印数组：");
        forloop1.printarray(ns);
        System.out.println("for each遍历打印数组：");
        foreach.printarray(ns);
    }
}
