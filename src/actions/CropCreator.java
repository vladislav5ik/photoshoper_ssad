package actions;


public class CropCreator implements ActionCreator{

    @Override
    public Action createAction() {
        return new Crop();
    }
}
