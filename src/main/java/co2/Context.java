package co2;

public class Context {
    Pizza pizza ;

    public Context(String name) {
        if(name.equals("italian")){
            pizza= new ItalianPizza();
        }else if (name.equals("american")){
            pizza = new  AmericaPizza();
        }else {
            pizza = new DefaultPizza();
        }
    }

    public Pizza getPizza() {
        return pizza;
    }
}
