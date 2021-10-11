package actions;

import main.Image;


/**
 * Feature that edit brightness of the image
 */
public class AdjustBrightness implements Action{

    @Override
    public Image doAction(Image image) {
        System.out.println("AdjustBrightness");
        return image;
    }
}
