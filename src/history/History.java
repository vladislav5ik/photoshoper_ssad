package history;

import java.util.Stack;


/*
    The class that controls history
*/
public class History {
    public Stack<Snapshot> history;

    public History(Snapshot s){
        history = new Stack<Snapshot>();
        this.backup(s);
    }

    public void backup(Snapshot s){
        history.push(s);
    }

    public Snapshot undo(){
        // if there is one snapshot left in the history, it cannot be deleted
        if(history.size()==1){
            return history.lastElement();
        }
        return history.pop();
    }

}
