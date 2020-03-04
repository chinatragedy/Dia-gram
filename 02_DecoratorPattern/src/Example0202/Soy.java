package Example0202;

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
    public CupSize getCupSize() {
        return beverage.getSize();
    }

    @Override
    public double cast() {
        double fee = beverage.cast();
        switch (getCupSize()) {
            case Tall:
                fee += 0.4;
                break;
            case Grande:
                fee += 0.5;
                break;
            case Venti:
                fee += 0.6;
                break;
        }
        return fee;
    }
}
