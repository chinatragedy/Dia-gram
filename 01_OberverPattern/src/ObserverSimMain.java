public class ObserverSimMain {
    public static void main(String[] args) {
        // write your code here
        System.out.println("- Begin to test Observer Sim -");

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(45, 55, 101);
        weatherData.setMeasurements(85, 99, 101);
        weatherData.setMeasurements(0, 5, 101);
    }
}
