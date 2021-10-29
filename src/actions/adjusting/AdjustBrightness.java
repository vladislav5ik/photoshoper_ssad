package actions.adjusting;

import actions.Action;
import image.Extension;
import image.Image;


/**
 * Feature that edit brightness of the image
 */
public class AdjustBrightness implements Action {

    @Override
    public Image doAction(Image image) {
        if(image.extension != Extension.png){
            System.out.println("Error. Can perform action only with .png images");
            return image;
        }
        System.out.println("AdjustBrightness");
        return image;
    }
}
