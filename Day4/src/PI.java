/*
for循环计算PI
 */

public class PI {
    public static void main(String[] args) {
        int i = -1;
        float sum = 0;
        for(int n =1;n<1000000;n=n+2){
            i = -i;
            sum = sum+i*(1/n);
            /*
            这里如果n为整型的话，1也是整型，两个整型计算类型不会提升。
            即比如n=2，1/2只会输出0.
            所以n为整型时得到的结果是4.0，只有把n改为float型才能得到正确结果。
             */
        }
        float pi = sum*4;
        System.out.println(pi);
    }
}
