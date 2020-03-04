package Example0301;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

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
