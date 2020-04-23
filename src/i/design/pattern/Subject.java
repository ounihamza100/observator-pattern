package i.design.pattern;

/**
 * @author Hamza Ouni
 */
public interface Subject {

    /**
     * Take an observer as an argument to be registered
     * @param o Observer to be registered
     */
    void registerObserver(Observer o);

    /**
     * ake an observer as an argument to be removed
     * @param o Observer to be removed
     */
    void removeObserver(Observer o);

    /**
     * This Method is called to notify all observers
     *  when the subject state has changed.
     */
    void notifyObservers();
}
