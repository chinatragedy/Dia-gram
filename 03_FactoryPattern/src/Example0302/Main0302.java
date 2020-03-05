package Example0302;

import Example0302.Store.BasePizzaStore;
import Example0302.Store.ChiPizzaStore;
import Example0302.Store.NYPizzaStore;

public class Main0302 {
    public static void main(String[] args){
        System.out.println("- FactoryPattern Begin -");

        BasePizzaStore store;
        store = new NYPizzaStore();
        store.orderPizza("cheese");

        store = new ChiPizzaStore();
        store.orderPizza("cheese");
    }
}
