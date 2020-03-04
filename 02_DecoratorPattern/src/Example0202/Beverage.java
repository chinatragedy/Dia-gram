package Example0202;

public abstract class Beverage {

    String description = "default";
    CupSize size = CupSize.Tall;

    public String getDescription() {
        return description;
    }

    public CupSize getSize() {
        return size;
    }

    public void setSize(CupSize size) {
        this.size = size;
    }

    public abstract double cast();
}

enum CupSize {
    Tall,
    Grande,
    Venti
}
