package com.example.PROJET;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.test.R;

public class Exercice3_TP1_Main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercice3_tp1); 

        CheckBox option1 = findViewById(R.id.option1);
        CheckBox option2 = findViewById(R.id.option2);
        CheckBox option3 = findViewById(R.id.option3);
        CheckBox option4 = findViewById(R.id.option4);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        Button btnSuivant = findViewById(R.id.btnSuivant);
        Button btnQuitter = findViewById(R.id.btnQuitter);

        btnSuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityn.this, NextActivity.class);

                StringBuilder selectedOptions = new StringBuilder();
                if (option1.isChecked()) {
                    selectedOptions.append("Multiple Versions Combined\n");
                }
                if (option2.isChecked()) {
                    selectedOptions.append("Model View Controller\n");
                }
                if (option3.isChecked()) {
                    selectedOptions.append("Main Value Compiled\n");
                }
                if (option4.isChecked()) {
                    selectedOptions.append("Mandatory Validated Controls\n");
                }

                int selectedId = radioGroup.getCheckedRadioButtonId();
                String selectedRadio = selectedId == R.id.optionYes ? "OUI" : "NON";

                intent.putExtra("selectedOptions", selectedOptions.toString());
                intent.putExtra("selectedRadio", selectedRadio);
                startActivity(intent);
            }
        });

        btnQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Ferme l'activité actuelle
            }
        });
    }
}


}
