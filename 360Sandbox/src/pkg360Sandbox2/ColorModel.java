/**
 * @author reyob
 */
package pkg360Sandbox2;

public class ColorModel {
    
    //Compares if correct color chosen
    private int wrongMatches = 0;
    
    public boolean isNotYellow(){
        wrongMatches = wrongMatches +1;
        return false;
    }
    
    public boolean isYellow(){
        wrongMatches = 0;
        return true;
    }
    
    public int getNumberWrongMatches(){
        return wrongMatches;
    }
    
}
