package actions.coloring;

import actions.Action;
import image.Image;
import java.util.Scanner;
/**
 * Feature that take one of the effects to the image.
 * Either Bluish, Reddish, or Greenish.
 */
public class Effect  implements Action {

    @Override
    public Image doAction(Image image) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input effect (B - Bluish, R - Reddish, G - Greenish):");
        String effect = in.nextLine();
        return switch (effect) {
            case "B" -> (new Bluish()).doAction(image);
            case "R" -> (new Reddish()).doAction(image);
            case "G" -> (new Greenish()).doAction(image);
            default -> image;
        };
    }
}
