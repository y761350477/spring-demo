package annotation;

import org.springframework.stereotype.Component;

@Component
public class WeChatImpl implements WechatDAO {

    @Override
    public void login(String name) {
        System.out.println(name + "登录Wechat账号");
    }
}
