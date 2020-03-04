package Example0302;

public abstract class BasePizzaStore {
    public void orderPizza(String type) {
        Pizza pizze;
        pizze = creatPizze(type);

        pizze.prepare();
        pizze.bake();
        pizze.cut();
        pizze.box();

        System.out.println("Pizza is OK! " + pizze.name);
    }

    protected abstract Pizza creatPizze(String type);
}
