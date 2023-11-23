package co2;

public class PizzaShop2 {
    public void pay (String name){
        Pizza p = getOrder(name);
        System.out.println(p.getCost());
    }
    public Pizza getOrder(String nameOfPizza){
        if(nameOfPizza.equals("italian")){
            return new ItalianPizza();
        }else if (nameOfPizza.equals("american")){
            return new AmericaPizza();
        }else {
            return new DefaultPizza();
        }
    }
}
