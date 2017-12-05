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
        System.out.println("Pick a number, 1-9 \n");
        System.out.println("1 to see List");
        System.out.println("2 to see Map");
        System.out.println("3 to see Set");
        System.out.println("4 to see Tree");
        System.out.println("5 to see Queue");
        System.out.println("6 to see Threading");
        System.out.println("7 to see Executors");
        System.out.println("8 to see ");
        System.out.println("9 to see ");
        
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
                MyJavaCollectionTree.starttreecollections();
                break;
            case 5:
                MyJavaCollectionQueue.startqueuecollections();
                break;
            case 6:
                threadingtheneadle.exampleofthreading();
                break;
            case 7:
                threadingtheneadle2.exampleofexecutors();
                break;
        /*    case 8:
                 
                break;
            case 9:
                Connection.getconnection();
                break; */
            
            default:
                System.out.println("Enter a valid option.");
                break;
        }
        }catch (Exception ex) {
            System.out.println("Well, that didn't go as planned!");
        }
        
    }
    
}
