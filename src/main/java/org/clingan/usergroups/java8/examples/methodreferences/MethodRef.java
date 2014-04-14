/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clingan.usergroups.java8.examples.methodreferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import javafx.scene.effect.Light.Point;

/**
 *
 * @author johnclingan
 */
public class MethodRef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(10, 4, 13, 1, 37);
       
        array.forEach(new Consumer<Integer>() {
            public void accept(Integer i) {
                System.out.println(i);
            }
        });
        
        
        
        
        
        
//        array.forEach(i -> System.out.println(i));
        
        
        
        
        
        
        
//        array.forEach(System.out::println);

    }

}
