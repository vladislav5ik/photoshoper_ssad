package actions;

import main.Image;
/**
 * Feature that make image more green color
 */
public class Greenish  implements Action {

    @Override
    public Image doAction(Image image) {
        System.out.println("Greenish");
        return image;
    }
}
