import java.util.Stack;

public class Remote {

    private Command command;
    private Stack<Command> history;

    public Remote(){
        history = new Stack<>();
    }

    public void executeCommand(){
        command.execute();
        history.add(command);
    }

    public void undo(){
        if(!history.isEmpty()){
            Command prevCommand = history.pop();
            prevCommand.undo();
        }
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
