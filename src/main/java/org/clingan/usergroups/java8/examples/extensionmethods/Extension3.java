/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clingan.usergroups.java8.examples.extensionmethods;

import static org.clingan.usergroups.java8.examples.extensionmethods.MyInterface.length;

/**
 *
 * @author johnclingan
 */
public class Extension3 implements MyInterface, MyInterface2 {

    static String message = "Hello JUG";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Extension3 ext = new Extension3();
        ext.printString(message);
    }

    @Override
    public void printString(String string) {

        System.out.println(message);
        System.out.println("Length is " + length(message));
        System.out.println(transform(message));
    }
    
    public String transform(String string) {
        return MyInterface.super.transform(string);
    }
}
