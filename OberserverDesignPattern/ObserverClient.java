import Observable.*;
import Observer.*;

import java.util.Scanner;

public class ObserverClient {

    public static void main(String[] args){
        Observable<Double> weatherObservable = new WeatherScreenObservable();
        Observer phoneScreenObserver = new PhoneScreenObserver(weatherObservable);
        Observer laptopScreenObserver = new LaptopScreenObserver(weatherObservable);
        Observer watchScreenObserver = new WatchScreenObserver(weatherObservable);
        weatherObservable.add(phoneScreenObserver);
        weatherObservable.add(laptopScreenObserver);
        weatherObservable.add(watchScreenObserver);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of temperate updates");
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            double temp = sc.nextDouble();
            weatherObservable.setData(temp);
        }
    }
}
