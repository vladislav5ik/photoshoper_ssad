package actions;
import image.Image;
/**
 * Interface for all features (actions) that edit image.
 */
public interface Action {
    Image doAction(Image image);
}
