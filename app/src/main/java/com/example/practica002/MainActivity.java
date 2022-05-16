package com.example.practica002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre1);
        btnEnviar = findViewById(R.id.btnEnviar);

    }

    public void onClickEnviarDatos(View view){
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        String nomb = txtNombre.getText().toString();
        i.putExtra("dato", nomb);
        startActivity(i);
    }
}