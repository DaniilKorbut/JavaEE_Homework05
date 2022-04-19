package client;

import org.springframework.beans.factory.InitializingBean;

public class ClientBeanNoDefault implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ClientBeanNoDefault: In starter don't created default bean");
    }
}

