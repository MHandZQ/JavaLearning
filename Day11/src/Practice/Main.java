// TODO: 捕获异常并处理


package Practice;

public class Main {

    public static void main(String[] args) {
        String a = "12";
        String b = "x9";
        //法二：
        try {
            int c = stringToInt(a);
            int d = stringToInt(b);
            System.out.println(c * d);
        }catch (NumberFormatException e){
            System.out.println(e);
        }
    }
/*法一：
    static int stringToInt(String s) {
        try {
            return Integer.parseInt(s);
        }catch (NumberFormatException e){
            System.out.println(e);
        }
        return 0;
    }
 */

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}