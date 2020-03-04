package Example0201;

public class Main0201 {

    public static void main(String[] args) {
        // write your code here
        System.out.println("- Decorator Pattern Begin-");

        Beverage espresso = new Espresso();
        System.out.print(espresso.getDescription());
        System.out.println(" $" + espresso.cast());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.print(darkRoast.getDescription());
        System.out.println(" $" + darkRoast.cast());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.print(houseBlend.getDescription());
        System.out.println(" $" + houseBlend.cast());
    }
}