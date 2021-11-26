package history;
import image.ExtensionType;
import image.Image;
import image.ImageEditor;
import image.Triple;

import java.text.SimpleDateFormat;
import java.util.Date;


/*
Class containing copy of an image at a certain point in time.
*/
public class Snapshot implements Memento{
    private Triple[][] data;
    private int height;
    private int width;
    private ExtensionType format;
    private String date;

    public Snapshot(Triple[][] data, int height, int width, ExtensionType extension) {
        this.date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        this.data = data;
        this.height = height;
        this.width = width;
        this.format = extension;
    }

    @Override
    public String getSnapshotDate() {
        return date;
    }

    public Image restore(){
        return new Image(this.data, this.height, this.width, this.format);
    }

}
