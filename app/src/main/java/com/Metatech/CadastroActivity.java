package com.Metatech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }
    public void onClickVoltar(View v){
        //fecha a tela atual
        finish();
    }
    //ação que vai acontecer ao clicar no botao salvar
    public void onClickSalvar(View v){
        //pega todos os componentes de edit text da tela e transforma em variavel
        EditText editNome = findViewById(R.id.editNome);
        EditText editEmail = findViewById(R.id.editEmail);
        EditText editSenha = findViewById(R.id.editSenha);
        EditText editCSenha = findViewById(R.id.editCSenha);
        EditText editIdade = findViewById(R.id.editIdade);
        //confere se todos os campos estao preenchidos e mostra uma mensagem de erro se for TRUE
        if(editNome.getText().toString().equals("")||editEmail.getText().toString().equals("")||editSenha.getText().toString().equals("")||editCSenha.getText().toString().equals("")||editIdade.getText().toString().equals("")){
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
        }else{
            //fecha a tela atual
            finish();
        }
    }
}
