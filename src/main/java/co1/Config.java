package co1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = "co1")
public class Config {
//    @Bean
//    @Primary
//    public Milad getMilad(){
//        return new Milad();
//    }
    @Bean
    @Qualifier("milad")
    public Milad milad(){
        return new Milad();
    }
    @Bean
    @Qualifier(value = "milad")
    public Milad milad2(){
        return new Milad("hosien");
    }
    @Bean(name = "hasan")
    public BeanTest getBeanTest(){
        return new BeanTest();
    }
}
