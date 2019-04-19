package com.androidavanzado.variables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNombre;
    Button btnMostrar;
    TextView tvMensaje;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.editTextNombre);
        btnMostrar = findViewById(R.id.buttonMostraNombre);
        tvMensaje = findViewById(R.id.textViewMensaje);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre = etNombre.getText().toString();
                tvMensaje.setText("Hola " + nombre);
            }
        });

    }
}
