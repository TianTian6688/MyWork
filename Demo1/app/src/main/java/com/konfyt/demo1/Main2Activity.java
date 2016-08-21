package com.konfyt.demo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.konfyt.demo1.bean.Person;

import java.io.Serializable;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        Person person = (Person) intent.getSerializableExtra("name");

   //     Toast.makeText(this, "---"+person.toString(),Toast.LENGTH_LONG).show();


    }
}
