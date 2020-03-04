package Example0201;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " +Soy";
    }

    @Override
    public double cast() {
        return beverage.cast() + 0.40f;
    }
}
