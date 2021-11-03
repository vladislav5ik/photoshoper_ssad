package adapter;

import actions.Action;
import actions.ActionType;
import actions.transforming.Crop;
import actions.adjusting.AdjustBrightness;
import actions.adjusting.AdjustContrast;
import actions.adjusting.GammaCorrection;
import actions.coloring.Effect;
import actions.transforming.Rotate;
import image.ExtensionType;
import image.Image;
/*
* This is an intermediate class between actions and the image editor.
* It provides a bridge between these parts,
* because the actions can only work with certain
* extensions, whereas the picture can have a different extension.
*/
public class Adapter {
    public Action action;

    public Adapter(ActionType action){
        changeAction(action);
    }
    public void changeAction(ActionType action){
        switch (action){
            case crop -> this.action = new Crop();
            case rotate -> this.action = new Rotate();
            case effect -> this.action = new Effect();
            case adjustbrightness -> this.action = new AdjustBrightness();
            case adjustcontrast -> this.action = new AdjustContrast();
            case gammacorrection -> this.action = new GammaCorrection();
        }
    }
    /*
    * This function launches the action. At the same time
    * it converts the image to a format supported by this action.
    */

    public Image doAction(Image image){
        ExtensionType originalExtension = image.format;
        image = convertToPng(image);
        image = action.doAction(image);
        image = convertFromPng(image, originalExtension);
        return image;
    }

    /*
     * This function changes the image extension to png,
     * because action class can only work with this format.
     */
    private Image convertToPng(Image image){
        System.out.println("converting from ." + image.format + " to .png");
        image.format = ExtensionType.png;
        return image;
    }

    /*
    * When the action on image is complete, this function
    * changes the extension of the image to the original one.
    */
    private Image convertFromPng(Image image, ExtensionType extension){
        System.out.println("converting from .png to ." + extension);
        image.format = extension;
        return image;
    }
}
