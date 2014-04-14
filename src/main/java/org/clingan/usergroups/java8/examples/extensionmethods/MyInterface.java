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

interface MyInterface {

    public void printString(String string);
    
    
    
    
    
    
    
    
    
    
    
    
    
    static int length(String string) {
        return string.length();
    }
    
    default String transform(String string) {
        return string.toUpperCase();
    }
}
