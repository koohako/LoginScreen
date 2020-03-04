package com.Metatech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //adicionar Handler
        //2 milessegundos após a tela será fechada
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarMain();
            }
        },2000
        );
    }
    public void mostrarMain(){
        //abrir Main
        Intent iMain = new Intent(this,MainActivity.class);
        startActivity(iMain);
        finish();//fechar tela splash da memória
    }
}
