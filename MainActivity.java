package com.example.books2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    private TextView name;
    private TextView year;
    private TextView runtime;
    private TextView country;
    private TextView genre;
    private TextView desc;
    private Movies m;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        year = findViewById(R.id.year);
        runtime = findViewById(R.id.runtime);
        country = findViewById(R.id.country);
        genre = findViewById(R.id.genre);
        desc = findViewById(R.id.desc);
        InputStream stream = null;
        try {
            stream = getAssets().open("movies.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader reader = new InputStreamReader(stream);
        Gson gson = new Gson();
        m = gson.fromJson(reader, Movies.class);
    }

    public void fields_filling(View view) {

    }
}