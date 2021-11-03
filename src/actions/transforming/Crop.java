package actions.transforming;
import image.ExtensionType;
import image.Image;
import actions.Action;
/**
 * Feature that cut the part of an image
 */
public class Crop implements Action {

    @Override
    public Image doAction(Image image) {
        if(image.format != ExtensionType.png){
            System.out.println("Error. Can perform action only with .png images");
            return image;
        }
        System.out.println("Crop");
        return image;
    }
}
