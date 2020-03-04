package Example0201;

public abstract class Beverage {

    String description = "default";

    public String getDescription() {
        return description;
    }

    public abstract double cast();
}
