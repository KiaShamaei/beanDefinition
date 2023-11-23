package co2;

public class ItalianPizza implements Pizza{

    @Override
    public String getDescription() {
        return "this is Italian";
    }

    @Override
    public double getCost() {
        return 300;
    }
}
