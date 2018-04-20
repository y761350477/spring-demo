package test7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {

    @Bean(value = "user")
    public User user() {
        return new User();
    }

    @Bean(value = "timDAO")
    public TimDAO timDAO() {
        return new TimImpl();
    }

    @Bean(value = "wechatDAO")
    public WechatDAO wechatDAO() {
        return new WeChatImpl();
    }
}
