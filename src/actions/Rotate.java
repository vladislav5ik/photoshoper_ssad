package actions;

import main.Image;
/**
 * Feature that rotate image by 90 degrees right round
 */
public class Rotate  implements Action {

    @Override
    public Image doAction(Image image) {
        System.out.println("Rotate");
        return image;
    }
}
