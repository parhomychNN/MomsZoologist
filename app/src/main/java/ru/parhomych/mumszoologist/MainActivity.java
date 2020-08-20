package ru.parhomych.mumszoologist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonToFavorite = findViewById(R.id.buttonToFavorite);
        buttonToFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), YourFavoriteAnimalActivity.class);
                startActivity(intent);
            }
        });

        Button buttonToMemo = findViewById(R.id.buttonToMemo);
        buttonToMemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ZooMemoActivity.class);
                startActivity(intent);
            }
        });

        Button buttonToGallery = findViewById(R.id.buttonToGallery);
        buttonToGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GalleryActivity.class);
                startActivity(intent);
            }
        });
    }



}