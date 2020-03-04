package Example0202;

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
    public CupSize getCupSize() {
        return beverage.getSize();
    }

    @Override
    public double cast() {
        double fee = beverage.cast();
        switch (getCupSize()) {
            case Tall:
                fee += 0.1;
                break;
            case Grande:
                fee += 0.2;
                break;
            case Venti:
                fee += 0.3;
                break;
        }
        return fee;
    }
}
