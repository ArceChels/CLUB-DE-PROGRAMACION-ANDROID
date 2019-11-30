package com.example.botones;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btnLi;

    public TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            btn1=(Button) findViewById(R.id.boton1);
            btn2=(Button) findViewById(R.id.boton2);
            btn3=(Button) findViewById(R.id.boton3);
            btnLi=(Button) findViewById(R.id.btnL);
            txt1= (TextView) findViewById(R.id.text1);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt1.setText("boton 1 pulsado");
                    txt1.setTextColor(Color.BLUE);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt1.setText("boton 2 pulsado");
                    txt1.setTextColor(Color.MAGENTA);
                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt1.setText("boton 3  pulsado");
                    txt1.setTextColor(Color.RED);
                }
            });

            btnLi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt1.setText("");
                }
            });
    }
}
