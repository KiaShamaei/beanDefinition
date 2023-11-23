package co1;

import org.springframework.stereotype.Component;

@Component
public class BeanTest {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
