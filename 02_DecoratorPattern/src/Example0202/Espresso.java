package Example0202;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cast() {

        switch (getSize()) {
            case Tall:
                return 1;
            case Grande:
                return 2;
            case Venti:
                return 3;
            default:
                return 1;
        }
    }
}
