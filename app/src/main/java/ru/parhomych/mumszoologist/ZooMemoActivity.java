package ru.parhomych.mumszoologist;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ZooMemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoo_memo);

        Toolbar toolbar = findViewById(R.id.included_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.zoologists_memo);

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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}