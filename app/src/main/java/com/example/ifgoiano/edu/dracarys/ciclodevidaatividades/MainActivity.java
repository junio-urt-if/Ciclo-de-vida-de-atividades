package com.example.ifgoiano.edu.dracarys.ciclodevidaatividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends DebugActivity  {

    private static final String TAG = "si-urutai";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //testar o uso de log chamando o método testeLog
        //testeLog();
    }

    // método que testa os tipos de log disponibilizados pelo LogCat
    private void testeLog(){
        Log.d(TAG, "Log de debug");
        Log.w(TAG, "Log de alerta/warming");
        Log.i(TAG, "Log de informação");
        Log.v(TAG, "Log de verbose");
        Log.e(TAG, "Log de erro", new RuntimeException("Teste de exceção"));
    }
}

