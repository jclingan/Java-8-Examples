/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clingan.usergroups.java8.examples.streams;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author johnclingan
 */
public class ExternalIteration {

    /**
     * Print the square of the minimum even number
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(10, 4, 13, 1, 37, 20, 18, 6, 31, 44);

        int min = Integer.MAX_VALUE;
        
        for (Integer i : array) {
            if (i % 2 == 0) {
                System.out.println(i);
                min = (i*i < min) ? i*i : min;
            }
        }
        
        System.out.println("Min is " + min);
    }

}
