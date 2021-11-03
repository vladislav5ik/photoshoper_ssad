package actions.adjusting;

import actions.Action;
import image.ExtensionType;
import image.Image;

/**
 * Feature that edit brightness of the image
 */
public class AdjustBrightness implements Action {

    @Override
    public Image doAction(Image image) {
        if(image.format != ExtensionType.png){
            System.out.println("Error. Can perform action only with .png images");
            return image;
        }
        System.out.println("AdjustBrightness");
        return image;
    }
}
