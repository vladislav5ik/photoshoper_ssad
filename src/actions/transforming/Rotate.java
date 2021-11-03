package actions.transforming;

import actions.Action;
import image.ExtensionType;
import image.Image;
/**
 * Feature that rotate image by 90 degrees right round
 */
public class Rotate  implements Action {

    @Override
    public Image doAction(Image image) {
        if(image.format != ExtensionType.png){
            System.out.println("Error. Can perform action only with .png images");
            return image;
        }
        System.out.println("Rotate");
        return image;
    }
}
