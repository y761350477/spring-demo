package test4;

import org.springframework.stereotype.Component;

@Component
@Config.Cold
@Config.Creamy
public class TimImpl1 implements TimDAO {

    @Override
    public void login(String name) {
        System.out.println("TimImpl1");
    }
}
