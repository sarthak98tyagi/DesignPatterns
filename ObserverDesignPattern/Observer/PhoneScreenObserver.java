package Observer;

import Observable.Observable;
import Observable.WeatherScreenObservable;

public class PhoneScreenObserver implements Observer{
    private Observable<Double> weatherScreenObservable;

    public PhoneScreenObserver(Observable<Double> weatherScreenObservable){
        this.weatherScreenObservable = weatherScreenObservable;
    }
    @Override
    public void update() {
        System.out.println("Phone Screen Temperature Update "+weatherScreenObservable.getData());
    }
}
