package Observable;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherScreenObservable implements Observable<Double>{

    private List<Observer> observerList;
    private double temperature;

    public WeatherScreenObservable(){
        observerList = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update();
        }
    }

    @Override
    public Double getData() {
        return temperature;
    }

    @Override
    public void setData(Double data) {
        temperature = data;
        notifyObservers();
    }

}
