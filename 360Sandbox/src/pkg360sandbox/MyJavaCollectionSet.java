/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360sandbox;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.HashSet;

/**
 *
 * @author reyob
 */
class MyJavaCollectionSet {
    public static void main(String[] args) {}

    static void startsetcollections() {
        double n = 0;
        double j = 0;
        String k;
        System.out.println("We'll start with an empty HashSet.\n");
        HashSet<String> hset = new HashSet<String>();
        System.out.println("Here is the contents : [" + hset + "]\n");
        System.out.println("Now, lets add some things to the set.\n");
        hset.add("Vicious Mocery");
        hset.add("Healing Words");
        hset.add("Tasha's Hidious Laughter");
        hset.add("Cloud of Daggers");
        System.out.println("Here is the contents : [" + hset + "]\n");
        System.out.println("{These were some of my bard's favorite spells.}\n");
        System.out.println("Let's try adding that last one again, it was usefull.\n");
        hset.add("Cloud of Daggers");
        System.out.println("Here is the contents : [" + hset + "]\n");
        System.out.println("And that is one of the useful things about sets, no duplucates.\n");
        System.out.println("We could add a hundre nulls, but only keep one.\n");
        while (n < 100){
            hset.add(null);
            n = n+1;
        }
        System.out.println("Here is the contents : [" + hset + "]\n");
        System.out.println("Only one null.\n");
        System.out.println("Let's add a buch of random numbers.\n");
        while (j < 100){
            n = floor(random() * 100);
            k = Double.toString(n);
            hset.add(k);
            j = j+1;
        }
        System.out.println("Here is the contents : [" + hset + "]\n");
        System.out.println("That is way too much. Let's clear that up\n");
        hset.clear();
        System.out.println("Here is the contents : [" + hset + "]\n");
        
    }
    
    
    
}
