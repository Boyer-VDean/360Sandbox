/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360sandbox;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author reyob
 */
public class threadingtheneadle extends Thread {
    public static void main(String[] args) {
        (new threadingtheneadle()).start();
    }
    
    @Override
    public void run() {
        
        double randomnumber = floor(random() * 10);
        System.out.println("This thread will wait " + randomnumber + " seconds to print a line.");
            try {
                TimeUnit.SECONDS.sleep((long) randomnumber);
            } catch (InterruptedException  e) {
                e.printStackTrace();
            }
        
        System.out.println("This thread waited " + randomnumber + " seconds to print this line.");
    }

    static void exampleofthreading() {
        threadingtheneadle exampleone = new threadingtheneadle();
        exampleone.start();
        
        threadingtheneadle exampletwo = new threadingtheneadle();
        exampletwo.start();
        
        threadingtheneadle examplethree = new threadingtheneadle();
        examplethree.start();
        
        System.out.println("I'm just getting started.");
    }
/*
    static void exampleofexecutors() {
     
    }

    static void exampleofrunnables() {
        
    }
*/  

}

