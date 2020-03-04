package Example0302;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    public Pizza() {
        this.name = "";
    }

//    public void prepare() {
//
//        System.out.println(" Prepare " + name);
//        System.out.println(" Tossing dough...");
//        System.out.println(" Adding sauce...");
//        System.out.println(" Adding toppings: ");
//        for (String topping : toppings) {
//            System.out.println("   " + topping);
//        }
//    }

    void bake() {
        System.out.println(" Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println(" Cut the pizza into diagonal slices");
    }

    void box() {
        System.out.println(" Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}