package actions;



public class EffectCreator implements ActionCreator{

    @Override
    public Action createAction() {
        return new Effect();

    }
}
