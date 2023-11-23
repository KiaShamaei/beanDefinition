package co2;

import java.awt.image.PixelGrabber;

public class PizzaShop {
    public void pay (String name){
        Pizza p = getOrder(name);
        System.out.println(p.getCost());
    }
    public Pizza getOrder(String nameOfPizza){
        Pizza p = PizzaFactory.makePizza(nameOfPizza);
        return p;
    }
}
