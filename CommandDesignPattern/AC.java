public class AC {

    private boolean off;
    private int temperature;

    public AC(boolean off, int temperature) {
        this.off = off;
        this.temperature = temperature;
    }

    public void turnOn(){
        System.out.println("Turning on AC");
        off = false;
    }

    public void turnOff(){
        System.out.println("Turning off AC");
        off=true;
    }

    public void changeTemperature(int temperature){
        this.temperature = Math.max(16,Math.min(30,temperature));
        System.out.println("Setting temperature: "+temperature);
    }

    public boolean isOff() {
        return off;
    }

    public void setOff(boolean off) {
        this.off = off;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
