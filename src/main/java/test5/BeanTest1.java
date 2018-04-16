package test5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanTest1 {

    @Value("${disc.title}")
    public String properties_test;



}
