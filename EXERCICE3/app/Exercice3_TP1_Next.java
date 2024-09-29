package com.example.PROJET;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.test.R;

public class Exercice3_TP1_Next extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercice3_tp1_next);
      
        String selectedOptions = getIntent().getStringExtra("selectedOptions");
        String selectedRadio = getIntent().getStringExtra("selectedRadio");

        TextView textViewResults = findViewById(R.id.textViewResults);

        String results = "Options sélectionnées :\n\n" + selectedOptions +
                "\nRéponse à la question 2 : " + selectedRadio;
        textViewResults.setText(results);
    }


}

}
