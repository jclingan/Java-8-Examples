/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clingan.usergroups.java8.examples.streams;

import static java.util.Arrays.asList;
import java.util.List;

interface MyInterface {

    public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
}

/**
 *
 * @author johnclingan
 */
public class InternalIterationMyInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> array = asList(10, 4, 13, 1, 37);

//        System.out.println("Min value is " + array.stream().min(
//                new Comparator<Integer>() {
//
//                    @Override
//                    public int compare(Integer o1, Integer o2) {
//                        return o1.compareTo(o2);
//                    }
//
//                }).get());

//        System.out.println("Min value is " + array.stream().min((x, y) -> x.compareTo(y)).get());

       // System.out.println("Min value is " + array.stream().min(Integer::compare).get());
//
        System.out.println("Min value is " + array.stream().min(MyInterface::compare).get());
        System.out.println("Count is " + array.stream().count());

    }

}
