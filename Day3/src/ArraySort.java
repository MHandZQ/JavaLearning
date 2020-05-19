/*
数组排序的几种方式
 */
import java.util.Arrays;
import java.util.Scanner;

//冒泡排序
class BubbleSort{
    public int[] sort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

//选择排序
class SelectionSort{
    public int[] sort(int[] array){
        for(int i=0;i<array.length;i++){
            int minIdex = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[i]) {
                    minIdex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIdex];
            array[minIdex] = temp;
        }
        return array;
    }
}

public class ArraySort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("*************本程序用于数组排序****************");
        System.out.println("请输入想要排序的数的数目：");
        int n =0;
        if(scan.hasNextInt()){
            n = scan.nextInt();
            int[] ns = new int[n];
            for(int m=0;m<n;m++){
                System.out.println("请输入第"+(m+1)+"个数");
                ns[m] = scan.nextInt();
            }
            System.out.println("输入完毕，开始排序");
            System.out.println("原数组为：");
            System.out.println(Arrays.toString(ns));
            bubbleSort.sort(ns);
            //selectionSort.sort(ns);
            System.out.println("排序后的数组为：");
            System.out.println(Arrays.toString(ns));
        }else
            System.out.println("请正确输入！");
    }
}

