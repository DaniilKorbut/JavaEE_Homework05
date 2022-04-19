package client;

import library.MyLibraryAutoConfig;
import library.MyLibraryClassCustom;
import library.MyLibraryClassDefault;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(MyLibraryAutoConfig.class)
public class ClientAutoConfig {

    @Bean
    @ConditionalOnBean(MyLibraryClassDefault.class)
    ClientBeanDefault clientBeanDefault() { return new ClientBeanDefault(); }

    @Bean
    @ConditionalOnMissingBean(MyLibraryClassDefault.class)
    ClientBeanNoDefault clientBeanNoDefault() { return new ClientBeanNoDefault(); }

    @Bean
    @ConditionalOnBean(MyLibraryClassCustom.class)
    ClientBeanCustom clientBeanCustom() { return new ClientBeanCustom(); }

}
