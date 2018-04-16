package test3.config1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import test3.config.Config;

@ComponentScan(basePackageClasses = {UserConfig1.class})
@Configuration
// 添加Config配置类
@Import(Config.class)
// 添加xml配置文件
@ImportResource("config-xml.xml")
public class Config1 {
}
