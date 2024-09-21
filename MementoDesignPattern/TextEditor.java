public class TextEditor {
    String word;

    public TextEditor(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public State createStateSnap(){
        return new State(word);
    }

    public void restore(State state){
        this.word = state.getState();
    }
}
