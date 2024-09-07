public class CommandClient {

    public static void main(String[] args) {
        Remote acRemote = new Remote();
        AC ac = new AC(true,16);
        TurnOnACCommand turnOnACCommand = new TurnOnACCommand(ac);
        acRemote.setCommand(turnOnACCommand);
        acRemote.executeCommand();
        acRemote.undo();
        TurnOffACCommand turnOffACCommand = new TurnOffACCommand(ac);
        acRemote.setCommand(turnOffACCommand);
        acRemote.executeCommand();
    }

}
