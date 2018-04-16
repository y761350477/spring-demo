package test2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(Config.class);
        ac.refresh();
        User user = (User) ac.getBean("user");
        System.out.println(user.getName());
    }
}
