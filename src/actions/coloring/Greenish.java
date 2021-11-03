package actions.coloring;

import actions.Action;
import image.ExtensionType;
import image.Image;
/**
 * Feature that make image more green color
 */
public class Greenish  implements Action {

    @Override
    public Image doAction(Image image) {
        if(image.format != ExtensionType.png){
            System.out.println("Error. Can perform action only with .png images");
            return image;
        }
        System.out.println("Greenish");
        return image;
    }
}
