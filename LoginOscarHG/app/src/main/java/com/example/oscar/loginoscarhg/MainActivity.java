package com.example.oscar.loginoscarhg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private EditText pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre =  findViewById(R.id.nombre);
        pass = (EditText) findViewById(R.id.password);
        Button mEmailSignInButton = (Button) findViewById(R.id.entrar);
        mEmailSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrar();
            }
        });


    }

    private void entrar() {

        nombre.setError(null);
        pass.setError(null);

        String nom = nombre.getText().toString();
        String password = pass.getText().toString();

        if(nom.isEmpty()){
            nombre.setError(getText(R.string.campo_requerido));
            return;
        }
        if (password.isEmpty()){
            pass.setError(getText(R.string.campo_requerido));
            return;
        }
        if (nom.equals("oscar") && password.equals("12345")){
            Intent intent = new Intent(this,SaludoActivity.class);
            startActivity(intent);
        }else{
            pass.setText("");
            pass.setError(getText(R.string.contraseña_incorrecta));
        }

    }


}
