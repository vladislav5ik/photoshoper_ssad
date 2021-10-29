import adapter.Action;
import adapter.Adapter;
import image.Extension;
import image.Image;
import image.ImageEditor;
import image.Triple;
import actions.transforming.Crop;
import actions.adjusting.AdjustBrightness;
import actions.adjusting.AdjustContrast;
import actions.adjusting.GammaCorrection;
import actions.coloring.Effect;
import actions.transforming.Rotate;

/**
 * Program start function.
 * Look at an example of how the program works!
 */
public class Main {

    public static void main(String[] args) {

        //the creation of an image object
        Triple[][] triple = new Triple[10][10];
        Image img = new Image(triple, 10, 10, Extension.jpg);
        ImageEditor editor = new ImageEditor(img);

        //Since action class objects are derived from action,
        //you can universally perform any action on an image using the doAction method
        //Creating action objects themselves
        Adapter adapter = new Adapter(Action.crop);
        editor.edit(adapter);
        adapter.changeAction(Action.adjustbrightness);
        editor.edit(adapter);
        adapter.changeAction(Action.adjustcontrast);
        editor.edit(adapter);
        adapter.changeAction(Action.gammacorrection);
        editor.edit(adapter);
        adapter.changeAction(Action.effect);
        editor.edit(adapter);
        adapter.changeAction(Action.rotate);
        editor.edit(adapter);


        //you can use the menu bar to make actions that
        //do not change the image (for example, zoom in)
        editor.menu.zoom();
        editor.menu.save();

        //you can close the file after work
        editor.menu.close();

        //you can open another image and work with it
        Image img2 = new Image(triple, 10, 10, Extension.png);
        editor.menu.open(img2);
        adapter.changeAction(Action.adjustcontrast);
        editor.edit(adapter);
        editor.menu.close();
    }
}
