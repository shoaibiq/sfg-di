package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("singleton constructor called !!!");

    }
    public void getMyScope(){
        System.out.println("Iam a singleton component");
    }
}
