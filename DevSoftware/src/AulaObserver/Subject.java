package AulaObserver;

import java.util.ArrayList;
import java.util.List;


public class Subject {

    private int State;

    private List<Observer> observers = new ArrayList<>();

    public int getState() {
        return State;
    }

    public void setState(int state) {
        State = state;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllOBservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
