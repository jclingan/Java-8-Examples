/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clingan.usergroups.java8.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author johnclingan
 */
public class InternalIterationReduce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> in = list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> {
                    System.out.println(i * i);
                    return i * i;
                })
                .reduce((a, b) -> a * b);

        if (in.isPresent()) {
            System.out.println("Sum of multipled squares is " + in.get());
        } else {
            System.out.println("No even numbers!");
        }
    }

}
