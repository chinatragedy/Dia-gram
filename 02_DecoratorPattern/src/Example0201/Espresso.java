package Example0201;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cast() {
        return 1.99f;
    }

}
