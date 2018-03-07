package com.andrealiznm.calculadorall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eDisplay;
    Button bIgual, bPunto;
    float valor1, valor2;
    String valorUno = "";
    boolean suma, resta, div, multi;
    int c=0, indicador=0;
    //double d = 2.01233324325221313412;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eDisplay = findViewById(R.id.eDisplay);
        eDisplay.setInputType(InputType.TYPE_NULL);

    }



    public void nueve(View view) {
        //Borrar contenido hasta copiar el segundo valor o se inicie un nuevo calculo
        if(valorUno.length() != 0 || indicador==1){
            eDisplay.setText("");
            valorUno = ""; indicador=0;
        }
        //Mostrar valor 9 en pantalla
        if(view.getId() == R.id.bNueve) {
            eDisplay.setText(eDisplay.getText()+"9");
        }
    }
    public void ocho(View view) {
        if(valorUno.length() != 0 || indicador==1){
            eDisplay.setText("");
            valorUno = ""; indicador=0;
        }
        if(view.getId() == R.id.bOcho) {
            eDisplay.setText(eDisplay.getText()+"8");
        }
    }
    public void siete(View view) {
        if(valorUno.length() != 0 || indicador==1){
            eDisplay.setText("");
            valorUno = ""; indicador=0;
        }
        if(view.getId() == R.id.bSiete) {
            eDisplay.setText(eDisplay.getText()+"7");
        }
    }
    public void seis(View view) {
        if(valorUno.length() != 0 || indicador==1){
            eDisplay.setText("");
            valorUno = ""; indicador=0;
        }
        if(view.getId() == R.id.bSeis) {
            eDisplay.setText(eDisplay.getText()+"6");
        }
    }
    public void cinco(View view) {
        if(valorUno.length() != 0 || indicador==1){
            eDisplay.setText("");
            valorUno = ""; indicador=0;
        }
        if(view.getId() == R.id.bCinco) {
            eDisplay.setText(eDisplay.getText()+"5");
        }
    }
    public void cuatro(View view) {
        if(valorUno.length() != 0 || indicador==1){
            eDisplay.setText("");
            valorUno = ""; indicador=0;
        }
        if(view.getId() == R.id.bCuatro) {
            eDisplay.setText(eDisplay.getText()+"4");
        }
    }
    public void tres(View view) {
        if(valorUno.length() != 0 || indicador==1){
            eDisplay.setText("");
            valorUno = ""; indicador=0;
        }
        if(view.getId() == R.id.bTres) {
            eDisplay.setText(eDisplay.getText()+"3");
        }
    }
    public void dos(View view) {
        if(valorUno.length() != 0 || indicador==1){
            eDisplay.setText("");
            valorUno = ""; indicador=0;
        }
        if(view.getId() == R.id.bDos) {
            eDisplay.setText(eDisplay.getText()+"2");
        }
    }
    public void uno(View view) {
        if(valorUno.length() != 0 || indicador==1){
            eDisplay.setText("");
            valorUno = ""; indicador=0;
        }
        if(view.getId() == R.id.bUno) {
            eDisplay.setText(eDisplay.getText()+"1");
        }
    }
    public void cero(View view) {
        if(valorUno.length() != 0 || indicador==1){
            eDisplay.setText("");
            valorUno = ""; indicador=0;
        }
        if(view.getId() == R.id.bCero) {
            eDisplay.setText(eDisplay.getText()+"0");
        }
    }
    public void punto(View view) {
        //c = c + 1;
        if(view.getId() == R.id.bPunto) {
            if (eDisplay.getText().toString().contains(".")){
                eDisplay.setText(eDisplay.getText()+"");
            } else {
                eDisplay.setText(eDisplay.getText()+".");
            }
        }
    }
    public void suma(View view) {
        if(view.getId() == R.id.bSuma) {
            valor1 = Float.parseFloat(eDisplay.getText().toString());
            suma = true;
            valorUno = Float.toString(valor1);
        }
    }
    public void resta(View view) {
        if(view.getId() == R.id.bResta) {
            valor1 = Float.parseFloat(eDisplay.getText().toString());
            resta = true;
            valorUno = Float.toString(valor1);
        }
    }
    public void multi(View view) {
        if(view.getId() == R.id.bMulti) {
            valor1 = Float.parseFloat(eDisplay.getText().toString());
            multi = true;
            valorUno = Float.toString(valor1);
        }
    }
    public void div(View view) {
        if(view.getId() == R.id.bDiv) {
            valor1 = Float.parseFloat(eDisplay.getText().toString());
            div = true;
            valorUno = Float.toString(valor1);
        }
    }
    public void igual(View view) {
        if(view.getId() == R.id.bIgual){
            //c=0;
            indicador=1;
            valor2 = Float.parseFloat(eDisplay.getText().toString());

            if (suma == true){
                eDisplay.setText(String.valueOf(valor1 + valor2));
                suma=false;
            } else if (resta == true){
                eDisplay.setText(String.valueOf(valor1 - valor2));
                resta=false;
            } else if(multi == true){
                eDisplay.setText(String.valueOf(valor1 * valor2));
                multi=false;
            } else if (div == true){
                eDisplay.setText(String.valueOf(valor1 / valor2));
                div=false;
            }
        }
    }

}
