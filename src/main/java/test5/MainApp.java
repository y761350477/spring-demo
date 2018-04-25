package test5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        // xml中使用属性占位符的情景(对于解析xml文件,不能使用AnnotationConfigApplicationContext进行解析)
        ApplicationContext ac = new ClassPathXmlApplicationContext("data1.xml");
        User test_xml = (User) ac.getBean("test_xml");
        System.out.println(test_xml.getName());

        // java中使用属性占位符的情景
        AnnotationConfigApplicationContext ac1 = new AnnotationConfigApplicationContext(Config.class);
        User1 user1 = (User1) ac1.getBean("user1");
        System.out.println(user1.getName());
    }
}
