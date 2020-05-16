import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        int sum = 0;
        int[][] ns = {
                {82, 90, 91},
                {68, 72, 64},
                {95, 91, 89},
                {67, 52, 60},
                {79, 81, 85}
        };
        //System.out.println(Arrays.deepToString(ns));
        int i = 0;
        for (int[] arr : ns) {
            for (int n : arr) {
                i = i + 1;
                sum = sum + n;
                System.out.print("" + n + "\t");
            }
        }
        System.out.println();
        float average = (float) sum / i;
        System.out.println(average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}


