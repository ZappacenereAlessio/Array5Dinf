package com.example.array5dinf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {


    ListView listafilms;
    int[] movieImages = {R.drawable.interstellar,R.drawable.inception,R.drawable.dune,R.drawable.alien};


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.second_activity);

            listafilms = findViewById(R.id.listviewFilms);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, MainActivity.films);
            listafilms.setAdapter(arrayAdapter);

            CustomAdapter customAdapter = new CustomAdapter();




           listafilms.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                    intent.putExtra("img", movieImages[position]);
                    startActivity(intent);
                }
            });
        }

    private class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return movieImages.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = getLayoutInflater().inflate(R.layout.third_activity, null);

            ImageView image = v.findViewById(R.id.images);
            image.setImageResource(movieImages[position]);

            return v;
        }
    }

}