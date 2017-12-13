/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360sandbox;

import java.net.*;
import java.io.*;

/**
 *
 * @author reyob
 */
public class Connection {

 public static void main(String[] args) throws Exception {}
 
    public static void getconnection() throws Exception {
        //First a valid connection
        URL oracle = new URL("http://www.google.com/");
        URLConnection yc = oracle.openConnection();
        long header_length = yc.getContentLengthLong();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        System.out.println("The header length is " + header_length);
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
        System.out.println("\n\nNow to try to connect to a page that doesn't exist.");
        //Next one that doesn't exist
        try
        {
            oracle = new URL("http://www.veldondeanboyer.com/");
            URLConnection yc2 = oracle.openConnection();
            BufferedReader in2 = new BufferedReader(new InputStreamReader(
                                    yc2.getInputStream()));
        while ((inputLine = in2.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
        }
        catch (Exception e)
        {
            System.out.println("Failed: no such page.");
        }
        
        System.out.println("\n\nLets go back to the first site for this next mistake.");
        try {
        oracle = new URL("http://www.goog.edu/");
        URLConnection yc3 = oracle.openConnection();
        BufferedReader in3 = new BufferedReader(new InputStreamReader(
                                    yc3.getInputStream()));
        inputLine = in3.readLine(); 
        System.out.println(inputLine);
        in.close();
        }
        catch (Exception e)
        {
            System.out.println("Need a loop to read that much info.");
        }
        
        System.out.println("\n\nI wonder what happens when we forget to put in a website?.");
        try {
        oracle = new URL("");
        URLConnection yc4 = oracle.openConnection();
        BufferedReader in4 = new BufferedReader(new InputStreamReader(
                                    yc4.getInputStream()));
        while ((inputLine = in4.readLine()) != null) 
            System.out.println(inputLine);
        in.close(); }
        catch (Exception e)
        {
            System.out.println("Need a website to visit.");
        }
    }
 
}
 /*   
    public static void getconnection() {
        
        Http http = new Http();
        
    try {
        URL url = new URL("htt//www.android.com/");
        java.net.HttpURLConnection urlConnection = (java.net.HttpURLConnection) url.openConnection();
        try{
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            System.out.println(in);
            //readStream(in);
        }finally{
            urlConnection.disconnect();
            }
    } catch (IOException te) {
        System.out.println("Well, that still didn't go as planned!");
    }
}
    //Will this help?
}
*/

