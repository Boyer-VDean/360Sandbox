/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360sandbox;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.ArrayList;

/**
 *
 * @author reyob
 */
class MyJavaCollectionList {
     
    public static void main(String[] args) {}
     
    //create arrayList
    public static ArrayList<String> numarray = new ArrayList<String>();
    
    static void startlistcollections() {
        double i = floor(random() * 10) + 5;
        System.out.println("We'll start with " + i + " items in an array.\n");
        double n = 0;
        while (n < i){
            enternumbersforlist();
            n = n+1;
        }
        
        printlist();
        
        System.out.println("We will now delete a random number from the array.\n");
        deletenumberonlist();
        
        //Replace value by position value
	System.out.println("Let's replace the second number with Frankenstein.\n");
	numarray.add(1, "Frankenstein");
	System.out.println("Here's what's in the list: " + numarray + "\n");
        
        // remove by potition value
        System.out.println("Let's remove that since it is not a number\n");
	numarray.remove("Frankenstein");
	System.out.println("Here's what is left in the list: " + numarray + "\n");
        
       // enternumbersforset();

       // enternumbersformap();
        
        // printset();

       // printmap();


    }
    

    private static void enternumbersforlist() {
        double inputnumber = floor(random() * 100);
       System.out.println("You are adding " + inputnumber + " to the array.");
       String inputstring = String.valueOf(inputnumber);
        //String inputstring = Double.parseDouble(inputnumber);
       numarray.add(inputstring);
    }

    private static void printlist() {
        System.out.println("The array is currently as follows: " + numarray);
    }

    private static void deletenumberonlist() {
        double numbertoremove = floor(random() * 10);
        numarray.remove(numbertoremove);
        System.out.println("The array is now as follows: " + numarray);
    }
    
}
