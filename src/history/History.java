package history;

import java.util.Stack;

public class History {
    public Stack<Snapshot> history;

    public History(){
        history = new Stack<Snapshot>();
    }

    public void backup(Snapshot s){
        history.push(s);
    }

    public Snapshot undo(){
        if(history.size()==1){
            return history.lastElement();
        }
        return history.pop();
    }

}
