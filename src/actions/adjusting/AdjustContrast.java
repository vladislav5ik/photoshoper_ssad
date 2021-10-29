package actions.adjusting;

import actions.Action;
import image.Image;
/**
 * Feature that edit contrast of the image
 */
public class AdjustContrast implements Action {

    @Override
    public Image doAction(Image image) {
        System.out.println("adjustContrast");
        return image;
    }
}
