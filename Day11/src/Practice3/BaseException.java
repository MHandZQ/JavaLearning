package Practice3;

public class BaseException extends RuntimeException {//声明了一个根异常类继承RuntimeException
    //四个构造方法
    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }
}
