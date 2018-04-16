package test3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 无法使用basePackages={"config"}扫描被嵌套的config包, 故使用Class类进行扫描,扫描范围为当前类的包.
@ComponentScan(basePackageClasses = {Config.class})
@Configuration
public class Config {
}
