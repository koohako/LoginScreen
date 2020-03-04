package com.Metatech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //ao criar a tela principal
        //pegar o e-mail e senha digitado
        Intent i = getIntent();
        String email = i.getStringExtra(MainActivity.EXTRA_MENSSAGE_EMAIL);
        String senha = i.getStringExtra(MainActivity.EXTRA_MENSSAGE_SENHA);

        //inserir valor nos EditText
        EditText editEmail = findViewById(R.id.editEmail);
        editEmail.setText(email);
        //a senha não sera visualizada pelo usuario
    }
}
