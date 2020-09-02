package ru.parhomych.mumszoologist;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TextView favoriteAnimalResultTextView;
    private final int REQUEST_CODE_FOR_FAVORITE = 1;

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
                startActivityForResult(intent, REQUEST_CODE_FOR_FAVORITE);
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
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == REQUEST_CODE_FOR_FAVORITE) {
                favoriteAnimalResultTextView = findViewById(R.id.favoriteAnimalResultTextView);
                if (data == null) {
                    return;
                }
                String favorite_animal = data.getStringExtra("favorite_animal");
                if (favorite_animal == null || favorite_animal.length() == 0) {
                    favoriteAnimalResultTextView.setText("");
                    return;
                }
                favoriteAnimalResultTextView.setText(String.format(getString(R.string.my_favorite_animal_result_on_main), favorite_animal));
            }
        }

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