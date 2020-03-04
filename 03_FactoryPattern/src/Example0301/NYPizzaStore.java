package Example0301;

public class NYPizzaStore extends BasePizzaStore {
    @Override
    protected Pizza creatPizze(String type) {

        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new NYCheesePizza();
                break;
            case "pepperoni":
                pizza = new NYPepperonPizza();
                break;
            case "clam":
                pizza = new NYClamPizza();
                break;
            case "veggie":
                pizza = new NYVeggiePizza();
                break;
            default:
                pizza = new NYCheesePizza();
                break;
        }

        return pizza;
    }
}
