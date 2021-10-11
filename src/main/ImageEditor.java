package main;


import actions.Action;
/**
 * Main class of the program.
 * similar to the interface between the program and the user
 * in the class itself, you can call the "edit" method,
 * which does a certain action according to the parameter passed
 *
 * Class contains a menuBar with "save", "open", "close" and "zoom" buttons
 */
public class ImageEditor {
    protected Image image;
    public menuBar menu;
    public ImageEditor(Image image) {
        this.image = image;
    }
    public void edit(Action action) {
        menu = new menuBar();
        System.out.print("Action : ");
        this.image = action.doAction(image);
    }
    public class menuBar {

        public Image save() {
            System.out.println("Saved");
            return image;
        }

        public void open(Image image_to_open) {
            System.out.println("Opened");
            image = image_to_open;
        }

        public void close() {
            System.out.println("Closed");
            image = null;
        }

        public void zoom() {
            System.out.println("Zoomed");
        }
    }
}
