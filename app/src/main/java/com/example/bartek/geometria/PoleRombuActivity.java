package com.example.bartek.geometria;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PoleRombuActivity extends AppCompatActivity {

    Button guzik;
    EditText bok1;
    EditText bok2;
    TextView wynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pole_rombu);

        guzik = (Button) findViewById(R.id.button);
        bok1 = (EditText) findViewById(R.id.editText1);
        bok2 = (EditText) findViewById(R.id.editText2);
        wynik =(TextView) findViewById(R.id.textView);

        bok1.setHint("Podaj dlugosc pierwszej przekatnej");
        bok2.setHint("Podaj dlugosc drugiej przekątnej");
        wynik.setHint("Tu pokaze sie wynik!");
        View.OnClickListener l = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    double a = Double.parseDouble(bok1.getText().toString());
                    double b = Double.parseDouble(bok2.getText().toString());
                    double pole = 0.5*a*b;
                    if(a>0 && b>0){
                        wynik.setText(String.format("%.2f",pole));
                    }else
                        Toast.makeText(getApplicationContext(), "Długości przekątnych muszą być większe od 0!", Toast.LENGTH_SHORT).show();
                }catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(), "Zły format danych!", Toast.LENGTH_SHORT).show();
                }


            }
        };
        guzik.setOnClickListener(l);
    }


}


