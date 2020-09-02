package ru.parhomych.mumszoologist;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class GalleryImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_image);

        Toolbar toolbar = findViewById(R.id.included_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.show_an_image);

        Intent intent = getIntent();

        int image_id = intent.getIntExtra("image_id", -1);

        if (image_id != -1) {
            ImageView imageView = findViewById(R.id.image_for_show);
            // TODO: take the image with id = image_id and place it on imageView
        }
    }
}