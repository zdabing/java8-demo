package wzbsdb.pattern.singleton;

/**
 * 饿汉式（枚举方式）
 * @author Surging
 * @create 2018/10/30
 * @since 1.0.0
 */
public enum Singleton04 {

    SUCCESS(0, "成功")
    ;

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    Singleton04(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public void doSomeThing() {
        System.out.println("枚举方法实现单例");
    }
}
