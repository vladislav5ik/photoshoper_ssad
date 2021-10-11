package actions;

public class GammaCorrectionCreator implements ActionCreator{

    @Override
    public Action createAction() {
        return new GammaCorrection();
    }
}
