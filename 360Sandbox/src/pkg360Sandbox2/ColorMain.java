/**
 * @author reyob
 */
package pkg360Sandbox2;

public class ColorMain {
    public static void main(String[] args) {
    ColorView theView = new ColorView();
    ColorModel theModel = new ColorModel();
    ColorController theController = new ColorController(theView, theModel);
    theView.setVisible(true);
    }
}
