package com.example.festonproject;

import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up); // Referência ao layout da atividade de Sign Up

        ImageView homeIcon = findViewById(R.id.homeIcon);
        homeIcon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Cria uma Intent para abrir MainActivity a partir de SignUpActivity
                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
