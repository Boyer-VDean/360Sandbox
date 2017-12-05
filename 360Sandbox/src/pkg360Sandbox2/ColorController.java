/**
 * @author reyob
 */
package pkg360Sandbox2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorController {
    private ColorView theView;
    private ColorModel theModel;
    
    public ColorController(ColorView theView, ColorModel theModel){
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addBlueListener(new WrongColorListener());
        this.theView.addGreenListener(new WrongColorListener());
        this.theView.addRedListener(new WrongColorListener());
        this.theView.addPinkListener(new WrongColorListener());
        this.theView.addBlackListener(new WrongColorListener());
        this.theView.addPurpleListener(new WrongColorListener());
        this.theView.addYellowListener(new CorrectColorListener());
    }
    
class WrongColorListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        theModel.isNotYellow();
        theView.setWrongMatches(theModel.getNumberWrongMatches());
    }
}
class CorrectColorListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        theModel.isYellow();
        theView.setWrongMatches(theModel.getNumberWrongMatches());
    }
}
}