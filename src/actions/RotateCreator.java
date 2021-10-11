package actions;

public class RotateCreator implements ActionCreator{

    @Override
    public Action createAction() {
        return new Rotate();
    }
}
