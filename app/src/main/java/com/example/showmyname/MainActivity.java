package com.example.showmyname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button showButton;
        TextView nameText;
        EditText enterName;
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        enterName = findViewById(R.id.editTextName);
        showButton = findViewById(R.id.button);
        nameText = findViewById(R.id.textView);


        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = enterName.getText().toString();
                if (name.isEmpty()) {
                    nameText.setText("Hello, Bond");
                } else {
                    nameText.setText("Hello, " + name);
                }
            }


        });
    }

}