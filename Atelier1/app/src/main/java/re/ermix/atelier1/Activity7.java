package re.ermix.atelier1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        Button b1 = findViewById(R.id.b1);
        b1.setOnClickListener(v -> {
            // Récupération des données du formulaire
            String nom = ((EditText)findViewById(R.id.nom)).getText().toString();
            String prenom = ((EditText)findViewById(R.id.prenom)).getText().toString();
            String email = ((EditText)findViewById(R.id.email)).getText().toString();

            // Création de l'Intent et passage des données
            Intent i = new Intent(Activity7.this, Activity8.class);
            i.putExtra("nom", nom);
            i.putExtra("prenom", prenom);
            i.putExtra("email", email);
            startActivity(i);
        });
    }
}