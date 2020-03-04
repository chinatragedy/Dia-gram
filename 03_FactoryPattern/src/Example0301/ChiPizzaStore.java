package Example0301;

public class ChiPizzaStore extends BasePizzaStore {
    @Override
    protected Pizza creatPizze(String type) {

        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new ChiCheesePizza();
                break;
            case "pepperoni":
                pizza = new ChiPepperonPizza();
                break;
            case "clam":
                pizza = new ChiClamPizza();
                break;
            case "veggie":
                pizza = new ChiVeggiePizza();
                break;
            default:
                pizza = new ChiCheesePizza();
                break;
        }

        return pizza;
    }
}
