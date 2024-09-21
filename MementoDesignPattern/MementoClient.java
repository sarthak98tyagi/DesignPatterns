public class MementoClient {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("Hello");
        textEditor.setWord("Hiii");
        State textEditorState = textEditor.createStateSnap();
        StatePreserver statePreserver = new StatePreserver();
        statePreserver.addState(textEditorState);
        textEditor.setWord("Hey");
        State undoState = statePreserver.undo();
        textEditor.restore(undoState);
        System.out.println(textEditor.getWord());
    }
}
