package library;

import org.springframework.beans.factory.InitializingBean;

public class MyLibraryClassDefault implements MyLibraryClass, InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyLibraryClassDefault: Created if value of property \"beanType\" is \"default\" or value is missing");
    }

}
