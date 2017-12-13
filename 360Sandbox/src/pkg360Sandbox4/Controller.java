/**
 * @author reyob
 */
package pkg360Sandbox4;

import pkg360Sandbox2.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Controller {
    public static HashMap<String,MathModel> hashMapOfCommands = new HashMap<String,MathModel>();
    
    public Controller(){
        
    }

    public static void handleCommand(String command, Integer num){
        hashMapOfCommands.put("+", new AddThirteen());
        hashMapOfCommands.put("-", new SubThirteen());
        hashMapOfCommands.put("*", new MultiplyThirteen());
        hashMapOfCommands.put("/", new DivideThirteen());
        
        MathModel handler = hashMapOfCommands.get(command);
        handler.thirteenMath(num);
        
        
    }
}
