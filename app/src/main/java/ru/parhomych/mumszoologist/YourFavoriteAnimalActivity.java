package ru.parhomych.mumszoologist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class YourFavoriteAnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_favorite_animal);

        Toolbar toolbar = findViewById(R.id.included_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.my_favorite_animal);

        final EditText editTextAnimal = findViewById(R.id.editTextAnimal);
        final EditText editTextComment = findViewById(R.id.editTextComment);
        Button buttonSend = findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("favorite_animal", editTextAnimal.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}