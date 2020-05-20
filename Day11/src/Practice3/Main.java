package Practice3;

import java.util.Scanner;//用于获取键入值

public class Main {
    public static void main(String[] args) {
        String username = "";//空字符串，有效避免NullPointerException
        String password = "";
        Scanner sc = new Scanner(System.in);//实例化Scanner类:sc
        System.out.println("**********自定义异常*************");
        System.out.println("请输入用户名：");
        if(sc.hasNextLine()){//判断是否还有输入值
            username = sc.nextLine();//获取键入值，赋值给username
        }
        System.out.println("请输入密码：");
        if(sc.hasNextLine()){
            password = sc.nextLine();
        }
        try {
            String token = login(username, password);
            System.out.println("Token: " + token);
        }catch (LoginFailedException e){//捕获LoginFailedException异常
            System.out.println(e);//打印异常
        }catch (UserNotFoundException e){//捕获UserNotFoundException异常
            System.out.println(e);//打印异常
        }
    }

    static String login(String username, String password) {
        if (username.equals("admin")) {
            if (password.equals("password")) {
                return "xxxxxx";
            } else {
                // 抛出LoginFailedException异常:
                throw new LoginFailedException("Bad username or password.");
            }
        } else {
            // 抛出UserNotFoundException异常:
            throw new UserNotFoundException("User not found.");
        }
    }
}
