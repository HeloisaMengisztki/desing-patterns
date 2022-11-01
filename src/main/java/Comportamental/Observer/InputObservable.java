package Comportamental.Observer;

import java.util.ArrayList;

public class InputObservable implements Observable{
    private ArrayList<Observer> Observers = new ArrayList();

    @Override
    public void subscribe(Observer observer) {

        Observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        Observers.remove(observer);
    }

    @Override
    public void notificar(String message) {
        for (Observer observer: Observers) {
            observer.update(message);
        }
    }
}
