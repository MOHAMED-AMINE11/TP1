package com.example.test;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
private EditText nomEditText, adresseEditText, surfaceEditText, piecesEditText;
    private CheckBox piscineCheckBox;
    private TextView impotBaseTextView, impotSuppTextView, impotTotalTextView;
    private Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercice2_tp1);

        nomEditText = findViewById(R.id.nomEditText);
        adresseEditText = findViewById(R.id.adresseEditText);
        surfaceEditText = findViewById(R.id.surfaceEditText);
        piecesEditText = findViewById(R.id.piecesEditText);
        piscineCheckBox = findViewById(R.id.piscineCheckBox);
        impotBaseTextView = findViewById(R.id.impotBaseTextView);
        impotSuppTextView = findViewById(R.id.impotSuppTextView);
        impotTotalTextView = findViewById(R.id.impotTotalTextView);
        calculateButton = findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              
                int surface = Integer.parseInt(surfaceEditText.getText().toString());
                int pieces = Integer.parseInt(piecesEditText.getText().toString());
                boolean hasPiscine = piscineCheckBox.isChecked();

                double impotBase = surface * 2;
                double impotSupp = pieces * 50;
                if (hasPiscine) {
                    impotSupp += 100;
                }
                double impotTotal = impotBase + impotSupp;
                impotBaseTextView.setText("Impôt de base : " + impotBase);
                impotSuppTextView.setText("Impôt supplémentaire : " + impotSupp);
                impotTotalTextView.setText("Impôt total : " + impotTotal);
            }
        });
    }
}
