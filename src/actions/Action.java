package actions;
import main.Image;
/**
 * Interface for all features (actions) that edit image.
 */
public interface Action {
    public Image doAction(Image image);
}
