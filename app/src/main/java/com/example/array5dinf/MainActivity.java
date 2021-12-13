package com.example.array5dinf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String nazioni[] = {"Italia", "Francia", "Germania", "Olanda" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn =(Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hai pemuto il tasto", Toast.LENGTH_LONG).show();

            }
        });


        ArrayAdapter<String> aaStati = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, nazioni);

      /*  ListView listaStati = (ListView)findViewById(R.id.lvStati);
        listaStati.setAdapter(aaStati); */
    }
}