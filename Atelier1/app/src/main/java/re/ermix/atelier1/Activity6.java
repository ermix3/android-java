package re.ermix.atelier1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity6 extends AppCompatActivity {
    EditText nom, prenom;
    Button btnConcat;
    TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        nom = findViewById(R.id.nom);
        prenom = findViewById(R.id.prenom);
        btnConcat = findViewById(R.id.btnConcat);
        txtResult = findViewById(R.id.txtResult);

        btnConcat.setOnClickListener(v -> {
            String complet = prenom.getText().toString() + " " + nom.getText().toString();
            txtResult.setText("Bonjour " + complet);
        });
    }
}