public class TurnOnACCommand implements Command{

    private AC ac;

    public TurnOnACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }
}
