package com.udc.imcudcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.udc.imcudcapp.modelo.Imc;

public class MainActivity extends AppCompatActivity {
   private EditText nomapeltext;
   private EditText pesotext;
   private EditText esttext;
   private TextView saltext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nomapeltext=findViewById(R.id.nomapeltext);
        pesotext=findViewById(R.id.pesotext);
        esttext=findViewById(R.id.esttext);
        saltext=findViewById(R.id.saltext);

    }


    public void calcularIMC(){

        Imc imc=new Imc(nomapeltext.getText().toString(),pesotext.getText().toString(),
                        esttext.getText().toString());
        saltext.setText(imc.calcularIMCString());


    }

    public void calcularEvento(View view){
        if(nomapeltext.getText().toString().length()==0 ||
                pesotext.getText().toString().length()==0 ||
                esttext.getText().toString().length()==0){
            Toast.makeText(this,"Campo(s) Vacio!!",Toast.LENGTH_LONG).show();
        }
        else {
            calcularIMC();
        }
    }
}