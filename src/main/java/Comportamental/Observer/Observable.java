package Comportamental.Observer;

import java.util.ArrayList;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notificar(String message);
}