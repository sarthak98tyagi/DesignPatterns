import java.awt.desktop.SystemEventListener;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving car");
    }
}
