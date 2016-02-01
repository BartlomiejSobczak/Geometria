package com.example.bartek.geometria;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    TextView t1, t2, t3, t4, t5, t6;
    ImageView i1, i2, i3, i4, i5, i6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        t4 = (TextView) findViewById(R.id.textView4);
        t5 = (TextView) findViewById(R.id.textView5);
        t6 = (TextView) findViewById(R.id.textView6);

        i1 = (ImageView) findViewById(R.id.img1);
        i2 = (ImageView) findViewById(R.id.img2);
        i3 = (ImageView) findViewById(R.id.img3);
        i4 = (ImageView) findViewById(R.id.img4);
        i5 = (ImageView) findViewById(R.id.img5);
        i6 = (ImageView) findViewById(R.id.img6);

        TextView[] t = {t1, t2, t3, t4, t5, t6};
        ImageView[] im = {i1, i2, i3, i4, i5, i6};

        for (int i = 0; i <= 5; i++) {
            t[i].setOnClickListener(this);
            im[i].setOnClickListener(this);
        }

    }

    Intent intent;

    @Override
    public void onClick(View v) {

        Context context = getApplicationContext();

        switch (v.getId()) {
            case R.id.textView1:
            case R.id.img1:
                intent = new Intent(context, PoleKwadratuActivity.class);
                break;
            case R.id.textView2:
            case R.id.img2:
                intent = new Intent(context, PoleProstokataActivity.class);
                break;
            case R.id.textView3:
            case R.id.img3:
                intent = new Intent(context, PoleKolaActivity.class);
                break;
            case R.id.textView4:
            case R.id.img4:
                intent = new Intent(context, PoleRombuActivity.class);
                break;
            case R.id.textView5:
            case R.id.img5:
                intent = new Intent(context, PoleTrojkataProstokatnegoActivity.class);
                break;
            case R.id.textView6:
            case R.id.img6:
                intent = new Intent(context, PoleTrojkataRownobocznegoActivity.class);
                break;
        }


        startActivity(intent);
    }
}
