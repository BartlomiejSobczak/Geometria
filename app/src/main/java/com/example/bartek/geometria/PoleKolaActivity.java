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

public class PoleKolaActivity extends AppCompatActivity {

    Button guzik;
    EditText bok;
    TextView wynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pole_kola);

        guzik = (Button) findViewById(R.id.button);
        bok = (EditText) findViewById(R.id.editText1);
        wynik = (TextView) findViewById(R.id.textView);
        bok.setHint("Podaj promień koła");

        View.OnClickListener l = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double r = (Double.parseDouble(bok.getText().toString()));
                    double pole = r * r * Math.PI;

                    if (r > 0) {

                        wynik.setText(String.format("%.2f",pole));
                    }else
                        Toast.makeText(getApplicationContext(), "Promień musi być większy niż 0!!", Toast.LENGTH_SHORT).show();

                }catch(Exception e){
                    Toast.makeText(getApplicationContext(), "Zły format danych!", Toast.LENGTH_SHORT).show();
                }
            }

        };

        guzik.setOnClickListener(l);


    }

}
