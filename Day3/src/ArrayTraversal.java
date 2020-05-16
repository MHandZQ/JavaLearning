/*
熟悉数组遍历的三种方法
 */
import java.util.Arrays;

class Loop{
    public void printarray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(""+array[i]+"\t");
        }
        System.out.print("\n");
    }
}

class Each{
    public void printarray(int[] array){
        for (int i:array) {
            System.out.print(""+i+"\t");
        }
        System.out.print("\n");
    }
}

class Methend{
    public void printarray(int[] array){
        //Java标准库中Arrays类中提供了遍历数组的方法rrays.toString(array)
        System.out.print(""+Arrays.toString(array)+"\t");
        System.out.print("\n");
    }
}

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] ns = {1,2,3,4,5};
        System.out.println("**************遍历数组的三种方法*************");
        Loop loop = new Loop();
        Each each = new Each();
        Methend methend = new Methend();
        System.out.println("for循环实现：");
        loop.printarray(ns);
        System.out.println("for each实现：");
        each.printarray(ns);
        System.out.println("Java标准库提供的Arrays.toString()实现：");
        methend.printarray(ns);
    }
}
