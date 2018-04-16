package test4;

import org.springframework.stereotype.Component;

@Component
@Config.Cold
@Config.Creamy
public class WebcharImpl1 implements WechatDAO {

    @Override
    public void login(String name) {
        System.out.println("WebcharImpl1");
    }
}
