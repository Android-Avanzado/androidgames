package com.androidavanzado.variables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvNombre;
    Button btnCambiarNombre;
    ImageButton btnEliminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNombre = findViewById(R.id.textViewNombre);
        btnCambiarNombre = findViewById(R.id.buttonCambiarNombre);
        btnEliminar = findViewById(R.id.imageButtonEliminar);
    }
}
