package test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring属性占位符的使用
 *
 * @author YC
 * @create 2018/4/16 9:45.
 */
public class MainAppTest1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(Config.class);
        ac.refresh();

        BeanTest1 beanTest = (BeanTest1) ac.getBean("beanTest1");
        System.out.println(beanTest.properties_test);
    }

}
