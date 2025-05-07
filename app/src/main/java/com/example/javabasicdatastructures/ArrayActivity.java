package com.example.javabasicdatastructures;

import android.util.Log;

import androidx.activity.ComponentActivity;
import java.util.*;

public class ArrayActivity extends ComponentActivity {
    private static String TAG = "ArrayActivity";

    //In Java, arrays are mutable. While the length of an array is fixed upon creation and
    // cannot be changed, the elements within the array can be modified. This means you can change
    // the values stored at specific indices within the array after it has been initialized.
    public void arrayOperations() {
        // declare an array of size 10;
        Integer[] array1 = new Integer[10];

        // declare an array along with its elements;
        int[] array2 = {1, 5, 3, 10};

        int length = array1.length;
        // get array size

        Log.d(TAG, "LENGTH " + length);

        // fill up array elements
        for(int i = 0;i<length;i++){
            array1[i] = i;
        }

        for(int i = 0;i<length;i++){
            Log.d(TAG, array1[i] + " ");
        }

        // sort an array
        Arrays.sort(array2);
        Log.d(TAG, "Printing sorted array elements");
        for(int i = 0;i<array2.length;i++){
            Log.d(TAG, array2[i] + " ");
        }

    // To convert an array to a list, the array type should not hold primitive data type
        // since list cannot hold primitive data type.

        // creates a mutable list from array approach 1
      List<Integer> arraylist =  new ArrayList<>(Arrays.asList(array1));
        Log.d(TAG, "Printing list");
        for(int i = 0;i<arraylist.size();i++){
            Log.d(TAG, arraylist.get(i) + " ");
        }

        // create a fixed size list approach 2
        List<Integer> arraylist1 = Arrays.asList(array1);

        // copy an array approach 1
        Integer[] copyarray1 = new Integer[array1.length];
        System.arraycopy(array1, 0, copyarray1, 0, array1.length);

        // copy an array approach 2
        Integer[] copyarray2 = Arrays.copyOf(array1, array1.length);

        String strarray = Arrays.toString(array1);
        Log.d(TAG, " STRING ARRAY " + strarray);


    }

}
