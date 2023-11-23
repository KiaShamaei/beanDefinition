package co2;

public class AmericaPizza implements Pizza {
    @Override
    public String getDescription() {
        return "this is american ...";
    }

    @Override
    public double getCost() {
        return 300;
    }
}
