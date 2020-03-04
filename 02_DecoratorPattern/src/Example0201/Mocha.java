package Example0201;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " +Mocha";
    }

    @Override
    public double cast() {
        return beverage.cast() + 0.20f;
    }
}
