package re.ermix.atelier9;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.database.Cursor;

public class MainActivity extends AppCompatActivity {

    EditText editTitre, editType, editId;
    Button btnAjouter, btnAfficher, btnModifier, btnSupprimer;
    TextView textResultat;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTitre = findViewById(R.id.editTitre);
        editType = findViewById(R.id.editType);
        editId = findViewById(R.id.editId);
        btnAjouter = findViewById(R.id.btnAjouter);
        btnAfficher = findViewById(R.id.btnAfficher);
        btnModifier = findViewById(R.id.btnModifier);
        btnSupprimer = findViewById(R.id.btnSupprimer);
        textResultat = findViewById(R.id.textResultat);

        db = new DatabaseHelper(this);

        btnAjouter.setOnClickListener(v -> {
            boolean result = db.insertFormation(editTitre.getText().toString(), editType.getText().toString());
            Toast.makeText(this, result ? "Ajouté" : "Erreur", Toast.LENGTH_SHORT).show();
        });

        btnAfficher.setOnClickListener(v -> {
            Cursor c = db.getAllFormations();
            StringBuilder sb = new StringBuilder();
            while (c.moveToNext()) {
                sb.append("ID: ").append(c.getInt(0)).append(" | Titre: ")
                        .append(c.getString(1)).append(" | Type: ").append(c.getString(2)).append("\n");
            }
            textResultat.setText(sb.toString());
        });

        btnModifier.setOnClickListener(v -> {
            String idStr = editId.getText().toString().trim();
            if (idStr.isEmpty()) {
                Toast.makeText(this, "Veuillez entrer un ID", Toast.LENGTH_SHORT).show();
                return;
            }

            int id = Integer.parseInt(idStr);
            boolean updated = db.updateFormation(id, editTitre.getText().toString(), editType.getText().toString());
            Toast.makeText(this, updated ? "Modifié" : "Erreur", Toast.LENGTH_SHORT).show();
        });

        btnSupprimer.setOnClickListener(v -> {
            String idStr = editId.getText().toString().trim();
            if (idStr.isEmpty()) {
                Toast.makeText(this, "Veuillez entrer un ID", Toast.LENGTH_SHORT).show();
                return;
            }

            int id = Integer.parseInt(idStr);
            boolean deleted = db.deleteFormation(id);
            Toast.makeText(this, deleted ? "Supprimé" : "Erreur", Toast.LENGTH_SHORT).show();
        });
    }
}
