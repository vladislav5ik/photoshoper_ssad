package image;


import adapter.Adapter;
import history.History;
import history.Snapshot;

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
    private History imageHistory;
    public menuBar menu;
    public ImageEditor(Image image) {
        this.image = image;
        this.imageHistory = new History(this.image.makeSnapshot());
    }

    public void edit(Adapter adapter) {
        menu = new menuBar();
        System.out.println("Performing action :");
        this.image = adapter.doAction(image);
        this.imageHistory.backup(this.image.makeSnapshot());
        System.out.println();
    }

    public void undo(){
        Snapshot snapshot = imageHistory.undo();
        this.image = snapshot.restore();
        System.out.println("Used backup date: "+snapshot.getSnapshotDate());
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
