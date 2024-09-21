import java.util.ArrayList;
import java.util.List;

public class StatePreserver {
    private List<State> stateList;

    public StatePreserver(){
        stateList = new ArrayList<>();
    }
     public void addState(State state){
        stateList.add(state);
     }

     public State undo(){
        if(!stateList.isEmpty()){
            return stateList.remove(stateList.size()-1);
        }
        return null;
     }
}
