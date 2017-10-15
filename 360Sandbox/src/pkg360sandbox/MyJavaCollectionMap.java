/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360sandbox;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import static oracle.jrockit.jfr.events.Bits.intValue;

/**
 *
 * @author reyob
 */
class MyJavaCollectionMap {
     public static void main(String[] args) {}
     
    public static Map<Integer, String> mymap = new HashMap<Integer, String>();

    static void startmapcollections() {
        //check to verify map is empty
        if (mymap.isEmpty()){
        System.out.println("This map is empty.\n");
        } else{
        System.out.println("This map is not empty.\n");
        }
        
        System.out.println("Let's add a few numbers to the map.\n");
        for(int i=0;i<5;i++){
            addtomap();
        }
        
        try{
        printmap();
        } catch (Exception e) {
            System.out.println("What is the probelem?");
        }
        
    }
     
    static void addtomap() {
        Integer i = intValue(floor(random() * 1000));
        String inputstring = String.valueOf(floor(random() * 1000))+ "_" + String.valueOf(i);
        mymap.put(i, inputstring);
    }
    
    
    static void printmap() {
        /* Display content using Iterator*/
        Set set = mymap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
        Map.Entry mentry = (Map.Entry)iterator.next();
        System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
        System.out.println(mentry.getValue());
        }
    }
    
}
