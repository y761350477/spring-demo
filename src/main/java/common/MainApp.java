package common;

import annotation.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        // 设值注入 Created by YC.
//        user_setter();
        // 构造注入 Created by YC.
//        user_structure();
        // 自动装配ByType Created by YC.
//        user_byType();
        // 自动装配ByName Created by YC.
        user_byName();
    }

    private static void user_byName() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = (User) ac.getBean("userAuto");
        user.doLogin();
    }

    private static void user_byType() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = (User) ac.getBean("userAuto");
        user.doLogin();
    }

    private static void user_structure() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = (User) ac.getBean("userStructure");
        user.doLogin();
    }

    private static void user_setter() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = (User) ac.getBean("userSetter");
        user.doLogin();
    }
}
