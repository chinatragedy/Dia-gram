package Example0202;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cast() {
        return 0.89f;
    }
}
