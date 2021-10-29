package actions.coloring;

import actions.Action;
import image.Image;

/**
 * Feature that make image more blue color
 */
public class Bluish implements Action {

    @Override
    public Image doAction(Image image) {

        System.out.println("Bluish");
        return image;
    }
}
