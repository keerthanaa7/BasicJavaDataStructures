package com.example.javabasicdatastructures;

import android.os.Bundle;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;
import com.example.javabasicdatastructures.ListClass;

public class JavaActivity extends ComponentActivity {
    ListClass listClass = new ListClass();
    ArrayActivity arrayActivity = new ArrayActivity();
    StringActivity stringActivity = new StringActivity();

    HashMapActivity hashMapActivity = new HashMapActivity();

    ConversionActivity conversionActivity = new ConversionActivity();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  listClass.listOperation();
      //  arrayActivity.arrayOperations();
     //   stringActivity.stringOperations();
       // hashMapActivity.hashMapOperation();
        conversionActivity.conversionOperation();

    }
}
