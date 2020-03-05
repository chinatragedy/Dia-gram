package Example0302;


public class NYCheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public NYCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

    public NYCheesePizza() {
        name = "NYCheesePizza";
    }
}