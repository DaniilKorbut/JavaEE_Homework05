package library;

import org.springframework.beans.factory.InitializingBean;

public class MyLibraryClassCustom implements MyLibraryClass, InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyLibraryClassCustom: Created if value of property \"beanType\" is \"custom\"");
    }
}
