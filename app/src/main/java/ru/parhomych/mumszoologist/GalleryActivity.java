package ru.parhomych.mumszoologist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        Toolbar toolbar = findViewById(R.id.included_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.animals_gallery);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}