package co2;

public class PizzaDecorator implements Pizza {
    Pizza pizza ;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + "with soouce";
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + 20 ;
    }
}
