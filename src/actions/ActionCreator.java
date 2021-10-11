package actions;

/**
 * Class for simplification of creating instances of feature classes.
 * All feature classes contain doAction method.
 */
public interface ActionCreator {
    public Action createAction();
}
