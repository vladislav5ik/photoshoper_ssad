package actions;

public class AdjustContrastCreator implements ActionCreator{

    @Override
    public Action createAction() {
        return new AdjustContrast();
    }
}
