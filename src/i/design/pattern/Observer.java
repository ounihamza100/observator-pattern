package i.design.pattern;

/**
 * Interace implemented by all observers
 * So they all have to implement the update(...) method.
 *
 * @author Hamza Ouni
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);
}
