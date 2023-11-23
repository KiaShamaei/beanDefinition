package co2;

public class PizzaFactory {
    public static Pizza makePizza(String name){
        if(name.equals("italian")){
            return new ItalianPizza();
        }else if (name.equals("american")){
            return new AmericaPizza();
        }else {
            return new DefaultPizza();
        }
    }
}
