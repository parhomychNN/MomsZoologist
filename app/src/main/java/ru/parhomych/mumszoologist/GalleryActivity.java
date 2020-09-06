package ru.parhomych.mumszoologist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        Toolbar toolbar = findViewById(R.id.included_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.animals_gallery);

        ImageView imageView1 = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView5 = findViewById(R.id.imageView5);

        imageView1.setTag(R.drawable.img1);
        imageView2.setTag(R.drawable.img2);
        imageView3.setTag(R.drawable.img3);
        imageView4.setTag(R.drawable.img4);
        imageView5.setTag(R.drawable.img5);

        List<ImageView> imageViews = new ArrayList<>();

        imageViews.add(imageView1);
        imageViews.add(imageView2);
        imageViews.add(imageView3);
        imageViews.add(imageView4);
        imageViews.add(imageView5);

        for (ImageView imageView : imageViews) {
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), GalleryImageActivity.class);
                    intent.putExtra("image_id", getDrawableId((ImageView)view));
                    startActivity(intent);
                }
            });
        }

    }

    private int getDrawableId(ImageView iv) {
        return (Integer) iv.getTag();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}