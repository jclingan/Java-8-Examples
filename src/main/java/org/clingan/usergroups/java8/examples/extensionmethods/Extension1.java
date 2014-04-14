/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clingan.usergroups.java8.examples.extensionmethods;

/**
 *
 * @author johnclingan
 */
public class Extension1 implements MyInterface {

    static String message = "Hello JUG";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Extension1 ext = new Extension1();
        ext.printString(message);

    }

    @Override
    public void printString(String string) {
        System.out.println(string);
    }
}
