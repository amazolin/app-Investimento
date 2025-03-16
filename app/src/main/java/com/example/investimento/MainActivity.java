package com.example.investimento;

import android.os.Bundle;
import android.view.View;
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


    public void calcular (View view) {
        try {
            float valorInicial = Float.parseFloat(edtValor.getText().toString());
            float aplication = Float.parseFloat(edtAplication.getText().toString());
            float qdtMeses = Float.parseFloat(edtTempo.getText().toString());
            float taxa = Float.parseFloat(edtTaxa.getText().toString());
            float aplicationTotal = aplication * qdtMeses;
            float valorIntermed = valorInicial + aplicationTotal;
            float valorTaxado = valorIntermed * taxa;
            float resultado = valorTaxado + valorIntermed;
            edtResultado.setText(String.format("R$ %.2f", resultado));

        } catch (NumberFormatException e) {
            // Se houver erro na conversão, exibe uma mensagem
            edtResultado.setText("Erro: Preencha todos os campos corretamente.");

        }
    }

}