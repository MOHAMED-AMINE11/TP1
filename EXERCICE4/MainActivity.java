package com.example.projet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNomPrenom, editTextEmail, editTextTelephone, editTextAdresse;
    private Spinner spinnerVille;
    private Button buttonEnvoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercice4_tp1);

        editTextNomPrenom = findViewById(R.id.editTextNomPrenom);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextTelephone = findViewById(R.id.editTextTelephone);
        editTextAdresse = findViewById(R.id.editTextAdresse);
        spinnerVille = findViewById(R.id.spinnerVille);
        buttonEnvoyer = findViewById(R.id.buttonEnvoyer);

        buttonEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomPrenom = editTextNomPrenom.getText().toString();
                String email = editTextEmail.getText().toString();
                String telephone = editTextTelephone.getText().toString();
                String adresse = editTextAdresse.getText().toString();
                String ville = spinnerVille.getSelectedItem().toString();
                if (nomPrenom.isEmpty() || email.isEmpty() || telephone.isEmpty() || adresse.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, NewActivity.class);
                    intent.putExtra("nomPrenom", nomPrenom);
                    intent.putExtra("email", email);
                    intent.putExtra("telephone", telephone);
                    intent.putExtra("adress", adresse);
                    intent.putExtra("ville", ville);
                    startActivity(intent);
                }
            }
        });
    }
}

