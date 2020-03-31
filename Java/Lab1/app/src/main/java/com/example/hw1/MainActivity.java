package com.example.hw1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //public boolean onCreateOptionsMenu(Menu menu){
    //   getMenuInflater().inflate(R.menu.main,menu);
    //   return super.onCreateOptionsMenu(menu);
    //}

}
