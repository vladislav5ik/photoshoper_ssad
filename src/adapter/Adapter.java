package adapter;

import actions.Action;
import actions.transforming.Crop;
import actions.adjusting.AdjustBrightness;
import actions.adjusting.AdjustContrast;
import actions.adjusting.GammaCorrection;
import actions.coloring.Effect;
import actions.transforming.Rotate;
import image.Extension;
import image.Image;

import java.util.InputMismatchException;

public class Adapter {
    public Action action;

    public Adapter(adapter.Action action){
        changeAction(action);
    }
    public void changeAction(adapter.Action action){
        switch (action){
            case crop -> this.action = new Crop();
            case rotate -> this.action = new Rotate();
            case effect -> this.action = new Effect();
            case adjustbrightness -> this.action = new AdjustBrightness();
            case adjustcontrast -> this.action = new AdjustContrast();
            case gammacorrection -> this.action = new GammaCorrection();
        }
    }
    public Image doAction(Image image){
        Extension originalExtension = image.extension;
        image = convertToPng(image);
        image = action.doAction(image);
        image = convertFromPng(image, originalExtension);
        return image;
    }

    private Image convertToPng(Image image){
        System.out.println("converting from ." + image.extension + " to .png");
        image.extension = Extension.png;
        return image;
    }

    private Image convertFromPng(Image image, Extension extension){
        System.out.println("converting from .png to ." + extension);
        image.extension = extension;
        return image;
    }
}
