package Example0201;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " +Whip";
    }

    @Override
    public double cast() {
        return beverage.cast() + 0.30f;
    }
}
