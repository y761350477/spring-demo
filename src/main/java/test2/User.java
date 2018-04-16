package test2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 注册bean
@Component
public class User {

    @Value("YangChen")
    private String name;

    @Value("男")
    private String sex;

    public User() {

    }

    public User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
