package re.ermix.atelier1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        // Récupération des données envoyées depuis `Activity7`
        Intent intent = getIntent();
        String nom = intent.getStringExtra("nom");
        String prenom = intent.getStringExtra("prenom");
        String email = intent.getStringExtra("email");

        // Affichage des données
        TextView t2 = findViewById(R.id.t2);
        t2.setText("Nom: " + nom + "\nPrénom: " + prenom + "\nEmail: " + email);

        // Bouton Retour
        Button b2 = findViewById(R.id.b2);
        b2.setOnClickListener(v -> {
            finish(); // Retour à l'activité précédente
        });

        // Bouton Confirmer (vers Main3)
        Button b3 = findViewById(R.id.b3);
        b3.setOnClickListener(v -> {
            Intent i = new Intent(Activity8.this, Activity9.class);
            startActivity(i);
        });
    }
}