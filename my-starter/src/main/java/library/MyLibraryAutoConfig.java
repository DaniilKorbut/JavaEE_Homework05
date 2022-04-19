package library;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLibraryAutoConfig {

    @Bean
    @ConditionalOnProperty(value = "beanType", havingValue = "custom")
    MyLibraryClassCustom MyLibraryClassCustom() {
        return new MyLibraryClassCustom();
    }

    @Bean
    @ConditionalOnProperty(value = "beanType", havingValue = "default", matchIfMissing = true)
    MyLibraryClassDefault myLibraryClassDefault() {
        return new MyLibraryClassDefault();
    }

//    @Bean
//    @ConditionalOnBean(name = "myLibraryClassPropertyValue")
//    MyLibraryClass myLibraryClassOnCustomBean() {
//        return new MyLibraryClassOnCustomBean();
//    }

}
