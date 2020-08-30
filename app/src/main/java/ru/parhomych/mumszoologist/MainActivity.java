package ru.parhomych.mumszoologist;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.included_toolbar);
        setSupportActionBar(toolbar);

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_main_about_the_app:
                startActivity(new Intent(this, AboutTheAppActivity.class));
                return true;
            case R.id.menu_main_settings:
                startActivity(new Intent(this, SettingsInterestsActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}