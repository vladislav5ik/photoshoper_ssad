package actions.adjusting;

import actions.Action;
import image.ExtensionType;
import image.Image;
/**
 * Feature that edit gamma (white-black balance) of the image
 */
public class GammaCorrection implements Action {

    @Override
    public Image doAction(Image image) {
        if(image.format != ExtensionType.png){
            System.out.println("Error. Can perform action only with .png images");
            return image;
        }
        System.out.println("GammaCorrection");
        return image;
    }
}
