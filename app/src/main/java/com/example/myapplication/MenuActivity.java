package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }
public void singlePlayer(View view){
        Intent intent = new Intent(this, SingleActivity.class);
        startActivity(intent);
}
    public void twoPlayer(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
