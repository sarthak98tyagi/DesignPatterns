public class TurnOffACCommand implements Command{

    private AC ac;

    public TurnOffACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }

    @Override
    public void undo() {
        ac.turnOn();
    }
}
