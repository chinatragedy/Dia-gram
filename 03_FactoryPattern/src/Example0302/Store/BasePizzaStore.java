package Example0302.Store;

import Example0302.Pizza.Pizza;

public abstract class BasePizzaStore {
    public void orderPizza(String type) {
        Pizza pizze;
        pizze = creatPizze(type);

        pizze.prepare();
        pizze.bake();
        pizze.cut();
        pizze.box();

        System.out.println("Pizza is OK! " + pizze.getName());
    }

    protected abstract Pizza creatPizze(String type);
}
