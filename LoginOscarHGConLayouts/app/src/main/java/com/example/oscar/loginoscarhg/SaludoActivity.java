package com.example.oscar.loginoscarhg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class SaludoActivity extends AppCompatActivity {
    private Spinner sp;
    private int posSpiner=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        sp=findViewById(R.id.spinner);

       sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              posSpiner=position;
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });

    }

    public void lanzador(View v){
        Intent intent=null;
        switch (posSpiner){
            case 0:
                Toast.makeText(getApplicationContext(),"Selecciona una opcion del spinner",Toast.LENGTH_SHORT).show();
                break;
            case 1:
                intent=new Intent(this,LinearLayoutEjemplo.class); startActivity(intent);

                break;
            case 2:
                intent=new Intent(this, TableLayoutEjempo.class); startActivity(intent);
                break;
            case 3:
                intent=new Intent(this, RelativeLayoutEjemplo.class); startActivity(intent);
                break;
            case 4:
                intent=new Intent(this, AbsoliteLayoutEjemplo.class); startActivity(intent);
                break;
            case 5:
                intent=new Intent(this, FrameLayoutEjemplo.class); startActivity(intent);
                break;
            case 6:
                intent=new Intent(this, ConstraintLayoutEjemplo.class); startActivity(intent);
                break;
            case 7:
                intent=new Intent(this, GridLayoutEjemplo.class); startActivity(intent);
                break;

        }

    }
}
