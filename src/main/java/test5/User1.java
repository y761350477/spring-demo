package test5;

import org.springframework.beans.factory.annotation.Value;

public class User1 {

    @Value("${disc.title}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
