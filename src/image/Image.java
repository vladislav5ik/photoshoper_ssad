package image;
/**
 * Class containing image data
 * In the real program this data will change (now - not yet)
 */
public class Image {
    Triple[][] data;
    int height;
    int width;
    public ExtensionType format;

    public Image(Triple[][] data, int height, int width, ExtensionType extension) {
        this.data = data;
        this.height = height;
        this.width = width;
        this.format = extension;
    }
}
