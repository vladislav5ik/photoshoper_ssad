package actions;

import main.Image;

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
