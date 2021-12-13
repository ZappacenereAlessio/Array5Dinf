package com.example.array5dinf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String nazioni[] = {"Italia", "Francia", "Germania", "Olanda" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Button btn =(Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              // Toast.makeText(getApplicationContext(), "Hai pemuto il tasto", Toast.LENGTH_LONG).show();
                openSecondActivity();
            }
        }); */ //Button

        ListView listaStati = (ListView)findViewById(R.id.lvStati);

        ArrayAdapter<String> aaStati = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, nazioni);
        listaStati.setAdapter(aaStati);

        listaStati.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //Italia

                    startActivity(new Intent(MainActivity.this,SecondActivity.class));
                }else if(position==1){

                    //Francia
                }else if (position==2){

                    //Germania
                }else {

                    //Olanda
                }
            }
        });



    }

}