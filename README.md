# Image Editor Project
Our team was faced with the question of developing software that would allow us to modify
photographs. To develop this software we decided to use the Memento pattern, because we want to
add an option for the user to return back to a previous version of the picture, in case the change
made was not needed.
### Problem:
A picture saving system should be created so that you don't have to manually create a copy of the
picture in order to safely perform the next action.
### Solution:
Snapshot represents stored image data to be written to the image in case of return. The history
class represents the storage of previous versions of the image and methods for interacting with
them.
#### More about details:
All elements, our solution contains: Action, Memento interface, enumerators ActionType,
ExtentionType and classes ImageEditor, Adapter, Image, menuBar, Triple, AdjustBrightness,
GammaCorrection, AdjustContrast, Rotate, Crop, Effect, Reddish, Greenish, Bluish, Snapshot,
History.
#### What parts of the program are used for:
- The ImageEditor class - the main class representing the application, all changes to the
images are made using it
- The menuBar class - part of the ImageEditor class representing the opening, closing and
application buttons (methods).
```java
public class ImageEditor
    ...
    public class menuBar {
        public Image save() {
            ...
        }
        public void open(Image image_to_open) {
            ...
        }
        public void close() {
            ...
        }
        public void zoom() {
            ...
        }
    }
}
```
- Class Adapter – link used to connect ImageEditor and Actions.
```java
public class Adapter {
    public Action action;
    ...
    public Image doAction(Image image){
        ExtensionType originalExtension = image.format;
        image = convertToPng(image);
        image = action.doAction(image);
        image = convertFromPng(image, originalExtension);
        return image;
    }
    private Image convertToPng(Image image){
        ...
    }
    private Image convertFromPng(Image image, ExtensionType extension){
        ...
    }
}
```
- The Action interface and classes AdjustBrightness, GammaCorrection, AdjustContrast,
Rotate, Crop, Effect, Reddish, Greenish, Bluish - represent the available transformations of
the image, as well as they are divided into packages based on the changes. Classes Reddish,
Greenish, Bluish are inherited from the class Effect as they perform similar actions, with
different parameters
- Enumerator ActionType - list of all available actions on an image, makes it easy to switch
the adapter between different actions
- Enumerator ExtentionType - list of all image formats handled, used in the Image class to
denote the format
- Class Image – representation of an image, containing all the image parameters we need
- Class Triple – color settings used to simulate an image(work as RGB)
```java
public class Image {
    Triple[][] data;
    int height;
    int width;
    public ExtensionType format;
    ...
    public Snapshot makeSnapshot(){
        return new Snapshot(this.data, this.height, this.width, this.format);
    }
}
```
- Class Snapshot – image parameter view, which contains all the image parameters we need to save to create the checkpoints.
```java
public class Snapshot implements Memento{
    private Triple[][] data;
    private int height;
    private int width;
    private ExtensionType format;
    private String date;
    ...
    @Override
    public String getSnapshotDate() {
        return date;
    }
    public Image restore(){
        return new Image(this.data, this.height, this.width, this.format);
    }
}
```
- Class History – set of all checkpoints and methods for interacting with snapshots
```java
public class History {
    public Stack<Snapshot> history;
    ...
    public void backup(Snapshot s){
        history.push(s);
    }
    public Snapshot undo(){
        if(history.size()==1){
            return history.lastElement();
        }
        return history.pop();
    }
}
```
![uml](uml.png) 
