/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360sandbox;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.Iterator;
import java.util.TreeSet;
import static oracle.jrockit.jfr.events.Bits.intValue;

/**
 *
 * @author reyob
 */
class MyJavaCollectionTree {
    
    public static void main(String[] args) {}
    
    static void starttreecollections() {
        //Create an empty tree set
        TreeSet ts = new TreeSet();
        //Add multiple items to the tree set
        System.out.println("Currently the tree is empty: " + ts.isEmpty());
        for(int i=0;i<5;i++){
            ts.add(i);
            ts.add(intValue(floor(random() * 100)));
            ts.add(intValue(floor(random() * 1000)));
        }
        Integer pv = ts.size();
        System.out.println("The colection has " + pv + " items in it now.\n");
        System.out.println("They are: " + ts + "\n");
        System.out.println("Let's take the 1 out.\n");
        ts.remove(1);
        pv = ts.size();
        System.out.println("The colection now has " + pv + "items in it now.\n");
        System.out.println("The tree now has the lower numbers" + ts.subSet(1, 5) + ".\n");
        System.out.println("The tree now has the higher numbers" + ts.subSet(6, 1000) + ".\n");
        System.out.println("Does the set contain the number 13? " + ts.contains(13));
        System.out.println("Let's add my favorite number to the tree.\n");
        System.out.println("(Unless it's already there!)\n");
        ts.add(13);
        System.out.println("The tree is now: " + ts + "\n");
        System.out.println("I'm going to try adding my number again.\n");
        ts.add(13);
        System.out.println("The tree is still: " + ts + "\n");
        System.out.println("The tree has the following numbers over 13 " + ts.tailSet(13) + "\n");
        System.out.println("The highest number in the tree is: " + ts.last() + "\n");
        
    }
    
}
