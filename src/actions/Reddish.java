package actions;

import main.Image;
/**
 * Feature that make image more red color
 */
public class Reddish implements Action {

    @Override
    public Image doAction(Image image) {
        System.out.println("Reddish");
        return image;
    }
}
