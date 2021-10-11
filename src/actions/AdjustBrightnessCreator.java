package actions;


public class AdjustBrightnessCreator implements ActionCreator{

    @Override
    public Action createAction() {
        return new AdjustBrightness();
    }
}
