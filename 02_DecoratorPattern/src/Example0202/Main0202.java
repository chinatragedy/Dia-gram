package Example0202;

public class Main0202 {

    public static void main(String[] args) {
        // write your code here
        System.out.println("- Decorator Pattern Begin-");

        Beverage espresso = new Espresso();
        espresso.setSize(CupSize.Grande);
        espresso = new Mocha(espresso);

        System.out.print(espresso.getDescription());
        System.out.println(" $" + espresso.cast());

//        Beverage darkRoast = new DarkRoast();
//        espresso.setSize(CupSize.Tall);
//        darkRoast = new Mocha(darkRoast);
//        darkRoast = new Mocha(darkRoast);
//        darkRoast = new Whip(darkRoast);
//        System.out.print(darkRoast.getDescription());
//        System.out.println(" $" + darkRoast.cast());
//
//        Beverage houseBlend = new HouseBlend();
//        espresso.setSize(CupSize.Tall);
//        houseBlend = new Soy(houseBlend);
//        houseBlend = new Mocha(houseBlend);
//        houseBlend = new Whip(houseBlend);
//        System.out.print(houseBlend.getDescription());
//        System.out.println(" $" + houseBlend.cast());
    }
}