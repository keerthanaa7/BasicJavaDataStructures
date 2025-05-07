package com.example.javabasicdatastructures;

import androidx.activity.ComponentActivity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapActivity extends ComponentActivity {

    public void hashMapOperation() {
        HashMap<Integer, Integer> intmap  = new HashMap<>();
        HashMap<Character, Integer> charmap = new HashMap<>();
        intmap.put(0, 10);
        intmap.put(1, 20);
        intmap.put(3, 30);
        intmap.put(5, 50);

        //print hashmap size
        System.out.println("size of hashmap " + intmap.size());

        //iterate through hashmap keyset
        for(int key : intmap.keySet()){
            System.out.println("key " + key + "value " + intmap.get(key) );
        }

        // check if a key is present
        if(intmap.containsKey(3)){
            System.out.println("contains key");
        } else {
            System.out.println("does not contain key");
        }

        // check if a key is present
        if(intmap.containsKey(7)){
            System.out.println("contains key");
        } else {
            System.out.println("does not contain key");
        }

        // check if a value is present
        if(intmap.containsValue(10)){
            System.out.println("contains value");
        } else {
            System.out.println("does not contain value");
        }

        // check if a value is present
        if(intmap.containsValue(100)){
            System.out.println("contains value");
        } else {
            System.out.println("does not contain value");
        }

        for(int val : intmap.values() ){
            System.out.println("val " + val);
        }

        for(Map.Entry<Integer, Integer> entry : intmap.entrySet()){
            System.out.println("key " + entry.getKey());
            System.out.println("value " + entry.getValue());
        }

        //Hash set
        Set<Integer> intSet = new HashSet<>();
        // adding elements to set
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        System.out.println("set size " + intSet.size());

        // remove an element from a set
        intSet.remove(3);
        System.out.println("set size " + intSet.size());

        // check if a set contains an element
        if(intSet.contains(4)){
            System.out.println("contains value");
        } else {
            System.out.println("does not contain value");
        }

        // iterating through a set
        for(int val : intSet){
            System.out.println("val " + val);
        }

    }
}
