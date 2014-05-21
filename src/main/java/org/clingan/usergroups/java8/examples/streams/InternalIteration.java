/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clingan.usergroups.java8.examples.streams;

import static java.util.Arrays.asList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author johnclingan
 */
public class InternalIteration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = asList(10, 4, 13, 1, 37, 20, 18, 6, 31, 44);
        
        Optional o = list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> { System.out.println(i*i); return i*i; } )
                .min(Integer::compare);
        
        System.out.println("Min is " + o.get());
    }

}
