package client;

import org.springframework.beans.factory.InitializingBean;

public class ClientBeanDefault implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ClientBeanDefault: In starter created default bean");
    }
}
