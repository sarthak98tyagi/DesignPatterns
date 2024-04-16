package Observable;

import Observer.Observer;

public interface Observable<T> {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
    T getData();
    void setData(T data);
}
