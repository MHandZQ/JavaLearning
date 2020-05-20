/*
当是throw new IllegalArgumentException();的时候
打印出的异常栈类似：
java.lang.IllegalArgumentException
    at Main.process1(Main.java:16)
    at Main.main(Main.java:6)
*****************************************************
当throw new IllegalArgumentException(e);把原始异常引入
打印出的异常栈类似：
java.lang.IllegalArgumentException: java.lang.NullPointerException
	at PassException2.Main.process1(Main.java:16)
	at PassException2.Main.main(Main.java:6)
Caused by: java.lang.NullPointerException
	at PassException2.Main.process2(Main.java:21)
	at PassException2.Main.process1(Main.java:14)
注意到Caused by: Xxx，说明捕获的IllegalArgumentException并不是造成问题的根源，
根源在于NullPointerException，是在Main.process2()方法抛出的。
 */

package PassException2;

public class Main {
    public static void main(String[] args) {
        try{
            process1();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void process1(){
        try{
            process2();
        }catch (NullPointerException e){
            throw new IllegalArgumentException(e);
        }
    }

    static void process2(){
        throw new NullPointerException();
    }
}