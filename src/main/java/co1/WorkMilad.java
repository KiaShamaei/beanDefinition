package co1;

import org.springframework.stereotype.Component;

@Component
public class WorkMilad {
    private Milad milad ;

    private String name;

    public WorkMilad() {
    }

    public WorkMilad(Milad milad, String name) {
        this.milad = milad;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Milad getMilad() {
        return milad;
    }

    public void setMilad(Milad milad) {
        this.milad = milad;
    }
}
