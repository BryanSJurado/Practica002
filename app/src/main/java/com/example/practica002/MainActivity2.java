package com.example.practica002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText txtNombre2;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtNombre2 = findViewById(R.id.txtNombre2);
        btnRegresar = findViewById(R.id.btnRegresar);

        Bundle bundle = getIntent().getExtras();
        txtNombre2.setText("Hola " + bundle.getString("dato"));
    }

    public void onClickRegresar(View view){
        Intent i = new Intent (MainActivity2.this, MainActivity.class);
        startActivity(i);
    }
}