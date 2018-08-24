package com.example.android.amitstudenttask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView nameTextView ;
    private TextView ageTextView ;
    private TextView gradeTextView ;
    private TextView sectionTextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nameTextView = findViewById(R.id.textview_name);
        ageTextView = findViewById(R.id.textview_age);
        gradeTextView = findViewById(R.id.textview_grade);
        sectionTextView = findViewById(R.id.textview_section);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        int age = bundle.getInt("age");
        String grade = bundle.getString("grade");
        int section = bundle.getInt("section");

        nameTextView.setText(name);
        ageTextView.setText(String.valueOf(age));
        gradeTextView.setText(grade);
        sectionTextView.setText(String.valueOf(section));

    }
}
