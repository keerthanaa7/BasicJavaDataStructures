package com.example.javabasicdatastructures;

import androidx.activity.ComponentActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class ListClass extends ComponentActivity {

    // n Java, a List can be either mutable or immutable, depending on how it is created.
    // The java.util.List interface itself does not enforce immutability.
    // Implementations like ArrayList are mutable, allowing elements to be added, removed,
    // or modified after creation.
    public void listOperation() {
        System.out.println("list operations");
        // declaring a list approach 1
        List<Integer> output = new ArrayList<>();
        output.add(1);
        output.add(2);
        output.add(10);
        output.add(3);
        // find length of a list
        int length = output.size();
        System.out.println("length " + length);

        // declaring a list approach 2
        //This static factory method creates an unmodifiable list directly. Attempts to modify it
        // will throw an UnsupportedOperationException. It does not allow null elements.
        List<Integer> list1 = List.of( 3, 10, 4);
        int length1 = list1.size();
        System.out.println("length1 " + length1);


        System.out.println("print list elements approach 1");
        // iterate and print list elements approach 1
        for(int i = 0;i<list1.size();i++){
            System.out.println(list1.get(i) + " ");
        }

        System.out.println("print list elements approach 2");
        // iterate and print list elements approach 2
        for(int val : list1){
            System.out.println(val + " ");
        }

        // convert list to 1d array approach 1.
        // THis approach does not work for primitive data types
        Integer[] listarray = new Integer[list1.size()];
        list1.toArray(listarray);

        System.out.println("print array elements converted from a list approach 1");
        for(int j = 0;j<listarray.length;j++){
            System.out.println(listarray[j] + " ");
        }

        // convert list to 1d array approach 2
        System.out.println("print array elements converted from a list approach 2");
        Integer[] listarray1 = new Integer[list1.size()];
        for(int i = 0;i<listarray1.length;i++){
            listarray1[i] = list1.get(i);
        }

        System.out.println("print array elements converted from a list approach 2");
        for(int k = 0;k<listarray.length;k++){
            System.out.println(listarray1[k] + " ");
        }

        // sort a list
        Collections.sort(output);
        // print a sorted list
        System.out.println("print a sorted list");
        for(int val : output){
            System.out.println(val + " ");
        }

        // find max in a list
        int max = Collections.max(output);
        System.out.println("print max in a list");
        System.out.println("max " + max);

        // convert list to a string
        String strlist = output.toString();
        System.out.println("strlist " + strlist);

        // remove an item from a list

        System.out.println("remove an element from a list");
        output.remove(2);
        for(int val : output){
            System.out.println(val + " ");
        }
    }


}
