import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {
    private ArrayList<IObserver> observerList;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observerList = new ArrayList<IObserver>();
    }

    @Override
    public void registerOb(IObserver ob) {
        observerList.add(ob);
    }

    @Override
    public void removeOb(IObserver ob) {
        int i = observerList.indexOf(ob);
        if (i >= 0) {
            observerList.remove(ob);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observerList.size(); i++) {
            IObserver ob = observerList.get(i);
            ob.update(temperature, humidity, pressure);
        }

    }

    public void measurementChanged() {
        notifyObserver();
    }

    //外界通知测量数据变化的接口
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementChanged();
    }
}
