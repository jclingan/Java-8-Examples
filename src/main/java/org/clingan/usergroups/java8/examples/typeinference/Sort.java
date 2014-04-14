/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clingan.usergroups.java8.examples.typeinference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author johnclingan
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>() {
            {
                add(new Person("Phil", "Yurchuk"));
                add(new Person("Ray", "Tayek"));
                add(new Person("John", "Clingan"));

            }
        };

//        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
//        
//        people.forEach(System.out::println);
    }

}
