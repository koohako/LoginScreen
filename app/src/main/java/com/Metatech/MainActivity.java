package com.Metatech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MENSSAGE_EMAIL = "com.metatech.EXTRA_MENSSAGE_EMAIL";
    public static final String EXTRA_MENSSAGE_SENHA = "com.metatech.EXTRA_MENSSAGE_SENHA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCadastro(View v){
        //cria tela
        Intent iCadastro = new Intent(this, CadastroActivity.class);
        //ativa e mostra tela
        startActivity(iCadastro);

    }

    public void onClickPrincipal(View v){
        //criar tela
        Intent iPrincipal = new Intent(this,PrincipalActivity.class);
        //pegar email e senha da tela
        EditText editEmail = findViewById(R.id.editEmail);
        EditText editSenha = findViewById(R.id.editSenha);
        String email = editEmail.getText().toString();
        String senha = editSenha.getText().toString();
        //se os campos de email e senha estiverem vazios deve mostrar uma mensagem de erro
        if(editEmail.getText().toString().equals("")||editSenha.getText().toString().equals("")){
            Toast.makeText(this, "E-mail ou senha incorretas", Toast.LENGTH_SHORT).show();
        }else{
            //passar parametro
            iPrincipal.putExtra(EXTRA_MENSSAGE_EMAIL,email);
            iPrincipal.putExtra(EXTRA_MENSSAGE_SENHA,senha);
            //abrir tela
            startActivity(iPrincipal);
        }

    }

}
