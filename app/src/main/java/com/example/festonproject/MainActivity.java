package com.example.festonproject;


import android.content.Intent; // Importação da classe Intent
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView profileIcon = findViewById(R.id.profileIcon); // Substitua pelo ID do ícone de perfil
        profileIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class); // Certifique-se de que SignUpActivity existe
                startActivity(intent);
            }
        });
    }
}
