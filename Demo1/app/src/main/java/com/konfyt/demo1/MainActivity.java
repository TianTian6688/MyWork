package com.konfyt.demo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.konfyt.demo1.bean.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add new line

    }

    public void TiaoZhuan(View view) {

        Person person = (Person)getIntent().getSerializableExtra("person");


        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("person",person);
        startActivity(intent);


    }
}
