package actions.transforming;
import image.Image;
import actions.Action;
/**
 * Feature that cut the part of an image
 */
public class Crop implements Action {

    @Override
    public Image doAction(Image image) {
        System.out.println("Crop");
        return image;
    }
}
