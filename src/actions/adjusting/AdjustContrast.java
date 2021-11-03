package actions.adjusting;

import actions.Action;
import image.ExtensionType;
import image.Image;
/**
 * Feature that edit contrast of the image
 */
public class AdjustContrast implements Action {

    @Override
    public Image doAction(Image image) {
        if(image.format != ExtensionType.png){
            System.out.println("Error. Can perform action only with .png images");
            return image;
        }
        System.out.println("adjustContrast");
        return image;
    }
}
