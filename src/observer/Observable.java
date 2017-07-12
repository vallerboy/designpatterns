package observer;

/**
 * Created by Lenovo on 12.07.2017.
 */
public interface Observable {
        void addObserver(Observer o);
        void removeObserver(Observer o);
        void update();

}
