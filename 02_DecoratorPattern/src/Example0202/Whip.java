package Example0202;

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
    public CupSize getCupSize() {
        return beverage.getSize();
    }

    @Override
    public double cast() {
        double fee = beverage.cast();
        switch (getCupSize()) {
            case Tall:
                fee += 1.1;
                break;
            case Grande:
                fee += 1.2;
                break;
            case Venti:
                fee += 1.4;
                break;
        }
        return fee;
    }
}
