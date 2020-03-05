package Example0302.Store;


import Example0302.Factory.NYPizzaIngredientFactory;
import Example0302.Factory.PizzaIngredientFactory;
import Example0302.Pizza.*;

public class NYPizzaStore extends BasePizzaStore {
    @Override
    protected Pizza creatPizze(String type) {

        Pizza pizza;
        PizzaIngredientFactory ingredientFactory;
        ingredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("NY Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("NY Pepperoni Pizza");

                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("NY Clam Pizza");

                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("NY Veggie Pizza");

                break;
            default:
                pizza = new CheesePizza();
                pizza.setName("NY Cheese Pizza");

                break;
        }

        return pizza;
    }
}
