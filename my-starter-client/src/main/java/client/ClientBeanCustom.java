package client;

import org.springframework.beans.factory.InitializingBean;

public class ClientBeanCustom implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ClientBeanCustom: In starter created custom bean");
    }
}
