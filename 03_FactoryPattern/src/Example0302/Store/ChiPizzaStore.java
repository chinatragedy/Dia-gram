package Example0302.Store;

import Example0302.Factory.ChicagoPizzaIngredientFactory;
import Example0302.Factory.PizzaIngredientFactory;
import Example0302.Pizza.*;

public class ChiPizzaStore extends BasePizzaStore {
    @Override
    protected Pizza creatPizze(String type) {

        Pizza pizza;
        PizzaIngredientFactory ingredientFactory;
        ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Pepperoni Pizza");

                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Clam Pizza");

                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Veggie Pizza");

                break;
            default:
                pizza = new CheesePizza();
                pizza.setName("Chicago Cheese Pizza");

                break;
        }

        return pizza;
    }
}
