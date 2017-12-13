/**
 * @author reyob
 */
package pkg360Sandbox4;

import java.util.Scanner;
import pkg360Sandbox2.*;

public class Main {
    public static void main(String[] args) {
        Integer num = 2;
        String command;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        num = Integer.parseInt(in.nextLine());
        System.out.println("Enter a Command: + - * / ");
        command = in.nextLine();
        
        
        Controller.handleCommand(command, num);
        
    }
}
