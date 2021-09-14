package com.codesol.imagesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String usu = "";
    private String pwd = "";

    private EditText et1;
    private EditText et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.etNombre);
        et2 = (EditText) findViewById(R.id.etPassword);
    }

    public void Login(View view){
        usu = String.valueOf(et1.getText().toString());
        pwd = String.valueOf(et2.getText().toString());

        if(usu.isEmpty()){
            Toast.makeText(this, "El Usuario no puede estar vacio...", Toast.LENGTH_SHORT).show();
        }
        if(pwd.isEmpty()){
            Toast.makeText(this, "El Password no puede estar vacio", Toast.LENGTH_SHORT).show();
        }

        if(usu.equals("admin") && pwd.equals("1234")){
            Toast.makeText(this, "Felicidades, ha ingresado a la cuenta..!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Usuario y/o Password incorrecto...", Toast.LENGTH_SHORT).show();
        }

    }
}