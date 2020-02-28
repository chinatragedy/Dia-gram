public class Demo_00_Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("- Begin to test Demo 00 Duck -");

        Duck duck = new MallardDuck();
        duck.PerformFly();
        duck.setFlyBehavior(new FlyRocketAwsome());
        duck.PerformFly();

        duck.PerformQuack();
        duck.setQuackBehavior(new Squeak());
        duck.PerformQuack();
    }
}
