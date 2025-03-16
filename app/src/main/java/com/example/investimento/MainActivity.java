package com.example.investimento;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView edtValor, edtAplication, edtTempo, edtTaxa, edtResultado;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        edtValor = findViewById(R.id.edtValor);
        edtAplication = findViewById(R.id.edtAplication);
        edtTempo = findViewById(R.id.edtTempo);
        edtTaxa = findViewById(R.id.edtTaxa);
        edtResultado = findViewById(R.id.edtResultado);
        btnCalcular = findViewById(R.id.btnCalcular);
    }

    public void calcular(float )

}