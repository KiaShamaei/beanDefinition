package co1;

import org.springframework.stereotype.Component;

@Component
public class Milad {
    //default java auto
    private String name ;
    //constructor

    public Milad() {
        System.out.println("this is  get");
    }

    public Milad(String name) {
        this.name = name;
    }

    public String getName() {
        return name + "kkk";
    }

    public void setName(String name) {
        this.name = name;
    }
}
