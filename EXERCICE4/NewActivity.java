package com.example.projet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercice4_tp1_next);

        Intent intent = getIntent();
        String nomPrenom = intent.getStringExtra("nomPrenom");
        String email = intent.getStringExtra("email");
        String telephone = intent.getStringExtra("telephone");
        String adresse = intent.getStringExtra("adress");
        String ville = intent.getStringExtra("ville");

        TextView textViewRecap = findViewById(R.id.textViewRecap);
        String recapText = "Nom : " + nomPrenom + "\n\n" +
                "Email : " + email + "\n\n" +
                "Phone : " + telephone + "\n\n" +
                "Adresse : " + adresse + "\n\n" +
                "Ville : " + ville;
        textViewRecap.setText(recapText);
    }
}

