package com.example.francisco.practica5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtIng, gKel, gRank, gFaren;
    private EditText temp;
    private Button btnConv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtIng = (TextView)findViewById(R.id.txtV1);
        gKel = (TextView)findViewById(R.id.txtgKelv);
        gRank = (TextView)findViewById(R.id.txtgRank);
        gFaren = (TextView)findViewById(R.id.txtgFaren);
        temp = (EditText)findViewById(R.id.edtxtTemp);
        btnConv = (Button)findViewById(R.id.btn1);


        btnConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp1 = temp.getText().toString();
                Double gC = Double.parseDouble(temp1);
                double gFa, gKe, gRa;
                double f, k, r;

                gFa = (gC*1.800)+32;
                gKe = 273.15+gC;
                gRa = (gC*1.800)+491.67;

                f = gFa;
                k = gKe;
                r = gRa;



                String res="",res1="",res2="";

                res = temp1 + "°C a grados fahrenheit = " + f + "°F";
                res1 = temp1 + "°C a grados kelvin = " + k + "°K";
                res2 = temp1 + "°C a grados rankine = " + r + "°R";

                gFaren.setText(res);
                gKel.setText(res1);
                gRank.setText(res2);







            }

        });
    }
}
