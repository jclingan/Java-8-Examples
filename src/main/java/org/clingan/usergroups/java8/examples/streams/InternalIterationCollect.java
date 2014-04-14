/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clingan.usergroups.java8.examples.streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author johnclingan
 */
public class InternalIterationCollect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 4, 13, 1, 37, 20, 18, 6, 31, 44);
        
        List<Integer>newList = list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i*i )
                .collect(Collectors.toList());;
        
        list.forEach(System.out::println); // Original list unchanged
        System.out.println("------");
        newList.forEach(System.out::println); // New list of squared even numbers
    }

}
