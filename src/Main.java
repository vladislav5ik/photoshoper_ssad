import actions.ActionType;
import adapter.Adapter;
import image.ExtensionType;
import image.Image;
import image.ImageEditor;
import image.Triple;

/**
 * Program start function.
 * Look at an example of how the program works!
 */
public class Main {

    public static void main(String[] args) {

        //The creation of an image object
        Triple[][] triple = new Triple[10][10];
        Image img = new Image(triple, 10, 10, ExtensionType.jpg);
        ImageEditor editor = new ImageEditor(img);

        try {
            //To apply an action to the image, we need
            //to create an Adapter - an object that acts
            //as an intermediary between the actions.
            Adapter adapter = new Adapter(ActionType.crop);
            editor.edit(adapter);

            //The following code specifies the action
            //and applies it to the image
            adapter.changeAction(ActionType.adjustbrightness);
            editor.edit(adapter);

            Thread.sleep(2000); // user delay

            adapter.changeAction(ActionType.adjustcontrast);
            editor.edit(adapter);

            Thread.sleep(2000); // user delay

            adapter.changeAction(ActionType.gammacorrection);
            editor.edit(adapter);

            Thread.sleep(2000); // user delay

            adapter.changeAction(ActionType.effect);
            editor.edit(adapter);

            Thread.sleep(2000); // user delay

            adapter.changeAction(ActionType.rotate);
            editor.edit(adapter);

            //you can use the menu bar to make other actions
            //that affects image editor window (for example, zoom in)
            editor.menu.zoom();
            editor.menu.save();


            //you can close the file after work
            editor.menu.close();

            //you can open another image and work with it
            Image img2 = new Image(triple, 10, 10, ExtensionType.png);
            editor.menu.open(img2);

            adapter.changeAction(ActionType.adjustcontrast);
            editor.edit(adapter);

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        //Using the memento pattern,
        // we can save previous states
        // of the image and do undo actions

        editor.undo(); // the image backup time will be printed
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();

        editor.menu.close();
    }
}
