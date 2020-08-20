package ru.parhomych.mumszoologist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ZooMemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoo_memo);

        TextView back = findViewById(R.id.textViewBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        final TextView memoTextView = findViewById(R.id.memo_text_view);

        RadioGroup radioGroup = findViewById(R.id.radioButtonGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case -1:
                        memoTextView.setVisibility(View.GONE);
                        break;
                    case R.id.radioButtonBears:
                        memoTextView.setVisibility(View.VISIBLE);
                        memoTextView.setText(R.string.bears_info);
                        break;
                    case R.id.radioButtonPenguins:
                        memoTextView.setVisibility(View.VISIBLE);
                        memoTextView.setText(R.string.penguins_info);
                        break;
                }
            }
        });
    }

}