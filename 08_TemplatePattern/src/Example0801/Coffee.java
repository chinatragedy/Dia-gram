package Example0801;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Boiling water");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
