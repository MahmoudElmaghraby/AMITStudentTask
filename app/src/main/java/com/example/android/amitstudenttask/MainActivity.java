package com.example.android.amitstudenttask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText ;
    private EditText ageEditText ;
    private EditText gradeEditText ;
    private EditText sectionEditText ;

    private Button enterButton ;
    private Button showButton ;

    Student myStudent = new Student();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.edittext_name);
        ageEditText = findViewById(R.id.edittext_age);
        gradeEditText = findViewById(R.id.edittext_grade);
        sectionEditText = findViewById(R.id.edittext_section);
        enterButton = findViewById(R.id.button_enter);
        showButton = findViewById(R.id.button_show);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = nameEditText.getText().toString();
                int age = Integer.parseInt(ageEditText.getText().toString());
                String grade = gradeEditText.getText().toString();
                int section = Integer.parseInt(sectionEditText.getText().toString());

                myStudent.setName(name);
                myStudent.setAge(age);
                myStudent.setGrade(grade);
                myStudent.setSection(section);

            }
        });

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("name" , myStudent.getName());
                bundle.putInt("age" , myStudent.getAge());
                bundle.putString("grade" , myStudent.getGrade());
                bundle.putInt("section" , myStudent.getSection());
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

    }
}
