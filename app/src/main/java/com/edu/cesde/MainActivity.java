package com.edu.cesde;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.edu.cesde.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mainBinding.getRoot();
        setContentView(view);
    }

    public void showMessage(View view){
        Toast.makeText(this, "Hola mundo", Toast.LENGTH_SHORT).show();
        mainBinding.tvPassword.setText("Contraseña");
    }

    public void signUp(View view){
        Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(intent);
    }
}