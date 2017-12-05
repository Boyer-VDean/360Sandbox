/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360sandbox;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import static oracle.jrockit.jfr.events.Bits.intValue;

/**
 *
 * @author reyob
 */
class MyJavaCollectionQueue {
    public static void main(String[] args) {}

    static void startqueuecollections() {
        Queue<Integer> qu = new LinkedList<Integer>();
        for(int i=0;i<5;i++){
            qu.add(intValue(floor(random() * 100)));
        }
        System.out.println("Initial Size of Queue :"+ qu.size());
        System.out.println("Queue :" + qu);
        System.out.println("Let's see and remove the first item in the queue " + qu.poll());
        System.out.println("Queue :" + qu);
        System.out.println("Let's see but not remove the first item in the queue " + qu.peek());
        System.out.println("Queue :" + qu);
        System.out.println("Add one more to the Queue");
        qu.add(intValue(floor(random() * 100)));
        System.out.println("Queue :" + qu);
        
    }
    
}
