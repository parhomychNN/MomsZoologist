package ru.parhomych.mumszoologist;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                String toastString = getString(R.string.formatted_toast_animal);
                toastString = String.format(toastString, editTextAnimal.getText().toString(), editTextComment.getText().toString());
                Toast toast = Toast.makeText(getApplicationContext(), toastString, Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}