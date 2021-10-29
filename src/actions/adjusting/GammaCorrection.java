package actions.adjusting;

import actions.Action;
import image.Image;
/**
 * Feature that edit gamma (white-black balance) of the image
 */
public class GammaCorrection implements Action {

    @Override
    public Image doAction(Image image) {
        System.out.println("GammaCorrection");
        return image;
    }
}
