package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 12.07.2017.
 */
public class BigLotto implements Observable {

    List<Observer> observerList = new ArrayList<>();

    public void doLotto(){
       // Logika losowania, losujemy liczby
        update();
    }

    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void update() {
        observerList.forEach(s -> s.update());
    }
}
