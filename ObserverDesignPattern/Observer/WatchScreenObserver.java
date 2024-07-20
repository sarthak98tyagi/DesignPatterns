package Observer;

import Observable.Observable;
import Observable.WeatherScreenObservable;

public class WatchScreenObserver implements  Observer{
    private Observable<Double> weatherScreenObservable;

    public WatchScreenObserver(Observable<Double> weatherScreenObservable){
        this.weatherScreenObservable = weatherScreenObservable;
    }
    @Override
    public void update() {
        System.out.println("Watch Screen Temperature Update "+weatherScreenObservable.getData());
    }
}

