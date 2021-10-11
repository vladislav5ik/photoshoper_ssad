import actions.*;

import main.Image;
import main.ImageEditor;
import main.Triple;

/**
 * Program start function.
 * Look at an example of how the program works!
 */
public class Main {

    public static void main(String[] args) {
        //Creating factories for actions
        ActionCreator factoryCrop = new CropCreator();
        ActionCreator factoryAdjustBrightness = new AdjustBrightnessCreator();
        ActionCreator factoryAdjustContrast = new AdjustContrastCreator();
        ActionCreator factoryGammaCorrection = new GammaCorrectionCreator();
        ActionCreator factoryEffect = new EffectCreator();
        ActionCreator factoryRotate = new RotateCreator();

        //Creating action objects themselves
        Crop crop = (Crop) factoryCrop.createAction();
        AdjustBrightness adjustBrightness = (AdjustBrightness) factoryAdjustBrightness.createAction();
        AdjustContrast adjustContrast = (AdjustContrast) factoryAdjustContrast.createAction();
        GammaCorrection gammaCorrection = (GammaCorrection) factoryGammaCorrection.createAction();
        Effect effect = (Effect) factoryEffect.createAction();
        Rotate rotate = (Rotate) factoryRotate.createAction();

        //the creation of an image object
        Triple[][] triple = new Triple[10][10];
        Image img = new Image(triple, 10, 10);
        ImageEditor editor = new ImageEditor(img);

        //Since action class objects are derived from action,
        //you can universally perform any action on an image using the doAction method
        editor.edit(crop);
        editor.edit(adjustBrightness);
        editor.edit(adjustContrast);
        editor.edit(gammaCorrection);
        editor.edit(effect);
        editor.edit(rotate);

        //you can use the menu bar to make actions that
        //do not change the image (for example, zoom in)
        editor.menu.zoom();
        editor.menu.save();

        //you can close the file after work
        editor.menu.close();

        //you can open another image and work with it
        Image img2 = new Image(triple, 10, 10);
        editor.menu.open(img2);
        editor.edit(adjustContrast);
        editor.menu.close();
    }
}
