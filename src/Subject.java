
import Observer.Observer;

public interface Subject {

    /**
     * addObserver método que registra observers en Batalla
     * 
     * @param o
     */
    public static void addObserver(Observer o) {
    }

    /**
     * removeObserver método para de-subscribirse de oBatalla
     * 
     * @param o
     */
    public static void removeObserver(Observer o) {
    }

    /**
     * notifyObserver método que actualiza los observers
     * 
     * @param o
     */
    public static void notifyObservers(Batalla battalla) {
    }

}