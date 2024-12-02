package com.example.festonproject;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Este método será chamado nas subclasses, então podemos configurar aqui
        setupNavigationIcons();
    }

    // Configuração centralizada para os ícones da barra de navegação
    protected void setupNavigationIcons() {
        // Ícone de pesquisa
        ImageView searchIcon = findViewById(R.id.searchIcon);
        if (searchIcon != null) { // Verifica se o ícone existe no layout atual
            searchIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(BaseActivity.this, SearchpageActivity.class);
                    startActivity(intent);
                }
            });
        }

        // Ícone de perfil
        ImageView profileIcon = findViewById(R.id.profileIcon);
        if (profileIcon != null) {
            profileIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(BaseActivity.this, SignUpActivity.class);
                    startActivity(intent);
                }
            });
        }

        // Ícone de home
        ImageView homeIcon = findViewById(R.id.homeIcon);
        if (homeIcon != null) {
            homeIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(BaseActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}

