/*
CatchException中调用String.getBytes(String)方法会报错让你必须加上try...catch
在该程序中调用的Integer.parseInt(Stirng)方法也有throws，调用时却不报错让你try...catch
是因为NumberFormatException是RuntimeException，不需要try...catch，运行时会抛出
 */

package PassEcception;

public class Main {
    public static void main(String[] args) {
            try{
                process1();
            }catch (Exception e){
                e.printStackTrace();
            }
    }

    static void process1(){
        process2();
    }

    static void process2(){
        Integer.parseInt(null);
    }
}
