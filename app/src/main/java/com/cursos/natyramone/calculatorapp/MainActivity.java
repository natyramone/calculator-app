package com.cursos.natyramone.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonUno = (Button) findViewById(R.id.button);
        Button botonDos = (Button) findViewById(R.id.button2);
        Button botonTres = (Button) findViewById(R.id.button3);
        Button botonCuatro = (Button) findViewById(R.id.button4);
        Button botonCinco = (Button) findViewById(R.id.button5);
        Button botonSeis = (Button) findViewById(R.id.button6);
        Button botonSiete = (Button) findViewById(R.id.button7);
        Button botonOcho = (Button) findViewById(R.id.button8);
        Button botonNueve = (Button) findViewById(R.id.button9);
        Button botonCero = (Button) findViewById(R.id.button0);
        Button botonPunto = (Button) findViewById(R.id.buttonPunto);
        Button botonIgual = (Button) findViewById(R.id.buttonIgual);
        Button botonSuma = (Button) findViewById(R.id.buttonSuma);
        Button botonResta = (Button) findViewById(R.id.buttonMenos);
        Button botonDivision = (Button) findViewById(R.id.buttonDivision);
        Button botonMultiplicacion = (Button) findViewById(R.id.buttonMultiplicacion);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button botonPresionado = (Button)v;
                EditText editText = (EditText) findViewById(R.id.editText);
                StringBuilder contenido = new StringBuilder(editText.getText());
                contenido.append(botonPresionado.getText());
                editText.setText(contenido.toString());

            }
        };

        View.OnClickListener listenerIgual = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                StringBuilder contenido = new StringBuilder(editText.getText());
                String valores[] = contenido.toString().split("\\+");
                Integer resultado = 0;
                for (int i =0; i< valores.length ; i++) {
                    resultado = resultado + Integer.valueOf(valores[i]);
                }
                editText.setText(resultado.toString());

            }
        };

        botonCero.setOnClickListener(listener);
        botonUno.setOnClickListener(listener);
        botonDos.setOnClickListener(listener);
        botonTres.setOnClickListener(listener);
        botonCuatro.setOnClickListener(listener);
        botonCinco.setOnClickListener(listener);
        botonSeis.setOnClickListener(listener);
        botonSiete.setOnClickListener(listener);
        botonOcho.setOnClickListener(listener);
        botonNueve.setOnClickListener(listener);
        botonPunto.setOnClickListener(listener);
        botonSuma.setOnClickListener(listener);
        botonResta.setOnClickListener(listener);
        botonDivision.setOnClickListener(listener);
        botonMultiplicacion.setOnClickListener(listener);
        botonIgual.setOnClickListener(listenerIgual);


    }

}
