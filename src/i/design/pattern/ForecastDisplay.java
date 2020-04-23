package i.design.pattern;

/**
 * @author Hamza Ouni
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        //Register this class as an observer
        weatherData.registerObserver(this);

    }

    @Override
    public void display() {
        if(this.temperature <= 80)
            System.out.println("Forecast : Improving weather on theway !");
        else
            System.out.println("Watch out for cooler, rainy weather");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;

        display();
    }
}
