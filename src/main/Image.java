package main;
/**
 * Class containing image data
 * In the real program this data will change (now - not yet)
 */
public class Image {
    Triple[][] data;
    int height;
    int width;

    public Image(Triple[][] data, int height, int width) {
        this.data = data;
        this.height = height;
        this.width = width;
    }
}
