package history;
import image.ExtensionType;
import image.Image;
import image.ImageEditor;
import image.Triple;

import java.text.SimpleDateFormat;
import java.util.Date;

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

//
//    public Triple[][] getData(){
//        return this.data;
//    }
//    public int getHeight(){
//        return this.height;
//    }
//    public int getWidth(){
//        return this.width;
//    }
//    public ExtensionType getFormat(){
//        return this.format;
//    }
}
