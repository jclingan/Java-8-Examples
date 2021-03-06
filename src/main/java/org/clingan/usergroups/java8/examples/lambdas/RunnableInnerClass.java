/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clingan.usergroups.java8.examples.lambdas;

/**
 *
 * @author johnclingan
 */
public class RunnableInnerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new RunnableInnerClass().runIt();
    }

    private void runIt() {
        String string = "World";
        
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello " + string);
                System.out.println("Class name is " + this.getClass().getName());
            }
        };

        new Thread(r).start();
    }
}
