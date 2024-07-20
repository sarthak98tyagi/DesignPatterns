package Observer;

import Observable.Observable;
import Observable.WeatherScreenObservable;

public class LaptopScreenObserver implements Observer{

    private Observable<Double> weatherScreenObservable;

    public LaptopScreenObserver(Observable<Double> weatherScreenObservable){
        this.weatherScreenObservable = weatherScreenObservable;
    }
    @Override
    public void update() {
        System.out.println("Laptop Screen Temperature Update "+weatherScreenObservable.getData());
    }
}
