package edu.tecii.android.practica3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ingresa;
    private TextView Horas,Minutos,Segundos,Decima;
    Button conv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingresa = (EditText)findViewById(R.id.editText2);
        Horas = (TextView)findViewById(R.id.textView3);
        Minutos = (TextView)findViewById(R.id.textView4);
        Segundos = (TextView)findViewById(R.id.textView5);
        Decima = (TextView)findViewById(R.id.textView6);
        conv = (Button)findViewById(R.id.button);
        conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cantidadcal=ingresa.getText().toString();
                int hora;
                int min;
                int seg;
                int dec;
                double cantidad = Double.parseDouble(cantidadcal);
                hora=(int) cantidad;
                cantidad= (cantidad-hora)*60;
                min=(int) cantidad;
                cantidad= (cantidad-min)*60;
                seg=(int) cantidad;
                cantidad= (cantidad-seg)*60;
                dec=(int) cantidad;
                String horaconv,minconv,segconv,deciconv="";

                horaconv="Horas = " + hora;
                minconv="Minutos = " + min ;
                segconv="Segundos = " + seg ;
                deciconv="Decimos = " + dec;

                Horas.setText(horaconv);
                Minutos.setText(minconv);
                Segundos.setText(segconv);
                Decima.setText(deciconv);
            }
        });
    }
}

