package i.design.pattern;

/**
 * @author Hamza Ouni
 */
public class ConcurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

public ConcurrentConditionDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    //Register this class as an observer
    weatherData.registerObserver(this);

}

    @Override
    public void display() {

        System.out.println("Current conditions : " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
