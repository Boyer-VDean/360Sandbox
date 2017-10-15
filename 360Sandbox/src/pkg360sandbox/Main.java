/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360sandbox;

import java.util.Scanner;

/**
 *
 * @author reyob
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //creates new scanner
        Scanner scanner = new Scanner(System.in);
        
        //Prompts user for input
        System.out.println("Pick a number, 1-9");
        
        //saves user input
        try{
        Integer input = scanner.nextInt();
        scanner.close();
        switch (input){
            case 1:
                MyJavaCollectionList.startlistcollections();
                break;
            case 2:
                MyJavaCollectionMap.startmapcollections();
                break;
            case 3:
                MyJavaCollectionSet.startsetcollections();
                break;
            case 4:
                threadingtheneadle.exampleofthreading();
                break;
        /*    case 5:
                threadingtheneadle.exampleofexecutors();
            case 6:
                threadingtheneadle.exampleofrunnables(); 
            case 7
                Connection.getconnection(); */
            
            default:
                System.out.println("Enter a valid option.");
                break;
        }
        }catch (Exception ex) {
            System.out.println("Well, that didn't go as planned!");
        }
        
    }
    
}
