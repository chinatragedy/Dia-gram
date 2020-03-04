package Example0301;

public class Main0301 {
    public static void main(String[] args){
        System.out.println("- FactoryPattern Begin -");

        BasePizzaStore store;
        store = new NYPizzaStore();
        store.orderPizza("cheese");

        store = new ChiPizzaStore();
        store.orderPizza("cheese");
    }
}
