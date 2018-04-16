package test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test3.config.UserConfig;
import test3.config1.Config1;
import test3.config1.UserConfig1;

public class MainApp {

    public static void main(String[] args) {

        // Config -> Config Created by YC.
//        test1();
        // Xml -> Config Created by YC.
        test2();

    }

    /**
     * Xml配置文件中添加另一个Xml配置文件及Config文件
     *
     * @author YC
     * @create 2018/4/16 11:16.
     */
    private static void test2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config-xml1.xml");
        UserConfig userConfig = (UserConfig) ac.getBean("userConfig");
        System.out.println(userConfig.getName());
        UserConfig xmlConfig = (UserConfig) ac.getBean("xmlConfig");
        System.out.println(xmlConfig.getName());
    }

    /**
     * Config配置文件中添加另一个Config配置文件及Xml配置文件
     *
     * @author YC
     * @create 2018/4/16 11:04.
     */
    private static void test1() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(Config1.class);
        ac.refresh();
        UserConfig1 userConfig1 = (UserConfig1) ac.getBean("userConfig1");
        System.out.println(userConfig1.getName());
        UserConfig userConfig = (UserConfig) ac.getBean("userConfig");
        System.out.println(userConfig.getName());
        UserConfig xmlConfig = (UserConfig) ac.getBean("xmlConfig");
        System.out.println(xmlConfig.getName());
    }
}
