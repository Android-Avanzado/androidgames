package com.androidavanzado.variables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String texto = "";
    char c = 'a';
    boolean saludoDia = true;
    int i = 0;
    long j = 10000000;

    float f = 1.5f;
    double d = 34234.545;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = "Buenos días Android";
        saludoDia = false;
    }
}
