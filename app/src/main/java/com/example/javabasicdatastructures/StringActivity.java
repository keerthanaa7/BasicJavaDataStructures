package com.example.javabasicdatastructures;

import android.util.Log;

import androidx.activity.ComponentActivity;

public class StringActivity extends ComponentActivity {
    private static String TAG = "StringActivity";


    //In Java, strings are immutable, which means that once a String object is created, its value
    // cannot be changed. Any operation that appears to modify a string actually creates a
    // new String object. The original string remains unchanged
    public void stringOperations(){
        String str1 = "Hello am fine";
        // get string length
        int length = str1.length();
        Log.d(TAG, "LENGTH " + length);

        // print each character in the string
        for(int i = 0;i<length;i++){
            Log.d(TAG, "each char " + str1.charAt(i));
        }

        // get a substring
        String sub1 = str1.substring(3);
        Log.d(TAG, "sub1 " + sub1);

        String sub2 = str1.substring(0,4);
        Log.d(TAG, "sub2 " + sub2);

        // find if a string contains a substring
        if(str1.contains("Hel")){
            Log.d(TAG , " CHAR SEQUENCE FOUND");
        } else {
            Log.d(TAG , " CHAR SEQUENCE not FOUND");
        }

        // create a string builder
        //StringBuilder in Java is a class used to create a mutable, or in other words, a modifiable succession of characters.
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('a');
        stringBuilder.append('b');
        String builderstring = stringBuilder.toString();

        Log.d(TAG, "string created from a string builder " + builderstring);


        // convert string to a character array
        char[] charArray = str1.toCharArray();
        for(int i = 0;i<charArray.length;i++){
            Log.d(TAG, "char array elements " + charArray[i]);
        }

        // trimming a string remove all trailing and leading white spaces and not in the middle
        String str2 = "   john   came    ";
        String newstr2 = str2.trim();
        Log.d(TAG, "NEWSTRING 2 " + newstr2 );

        // get index of a particular character
        int index1 = str2.indexOf('h');
        Log.d(TAG, "index1 " + index1 );

        // replace a character
        String newstr3 = str2.replace('j' , 'k');
        Log.d(TAG, "newstr3 " + newstr3 );

        // split a string into two parts
       String[] splitarray =  str1.split("0");
       for(String val : splitarray){
           Log.d(TAG, "val " + val);
       }


    }
}
