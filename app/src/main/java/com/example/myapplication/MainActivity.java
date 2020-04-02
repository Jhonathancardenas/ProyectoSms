package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LogCat","Entra en el metodo start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LogCat","Entra en el metodo resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LogCat","Entra en el metodo pause");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LogCat","Entra en el metodo destroy");
    }

    @Override
    public void onClick(View v) {
        Log.i("App", "Click Login");
    }
}
