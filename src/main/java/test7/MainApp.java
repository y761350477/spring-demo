package test7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 获取配置信息的三种方式
 * 注:
 *  1. 方式二和三不使用refresh()方法会报错.
 *
 * @author YC
 * @create 2018/4/20 17:10.
 */
public class MainApp {

    public static void main(String[] args) {
        test1();
//        test2();
//        test3();
    }

    // 获取配置信息的方式三(指定配置类)
    private static void test3() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(Config.class);
        ac.refresh();
        User user = (User) ac.getBean("user");
        user.doLogin();
    }

    // 获取配置信息的方式二(扫描包)
    private static void test2() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.scan("test7");
        ac.refresh();
        User user = (User) ac.getBean("user");
        user.doLogin();
    }

    // 获取配置信息的方式一(传统)
    private static void test1() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        User user = (User) ac.getBean("user");
        user.doLogin();
    }
}
