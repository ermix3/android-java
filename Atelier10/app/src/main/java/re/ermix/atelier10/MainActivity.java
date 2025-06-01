package re.ermix.atelier10;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.database.Cursor;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText editNom, editId;
    Button btnAjouter, btnAfficher, btnModifier, btnSupprimer, btnClear;
    TextView textResultat;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNom = findViewById(R.id.editNom);
        editId = findViewById(R.id.editId);
        btnAjouter = findViewById(R.id.btnAjouter);
        btnAfficher = findViewById(R.id.btnAfficher);
        btnModifier = findViewById(R.id.btnModifier);
        btnSupprimer = findViewById(R.id.btnSupprimer);
        textResultat = findViewById(R.id.textResultat);
        btnClear = findViewById(R.id.btnClear);
        db = new DatabaseHelper(this);

        btnAjouter.setOnClickListener(v -> {
            boolean inserted = db.insertClient(editNom.getText().toString());
            Toast.makeText(this, inserted ? "Client ajouté" : "Erreur d'ajout", Toast.LENGTH_SHORT).show();
        });

        btnAfficher.setOnClickListener(v -> {
            Cursor c = db.getAllClients();
            StringBuilder sb = new StringBuilder();
            while (c.moveToNext()) {
                sb.append("ID: ").append(c.getInt(0)).append(" | Nom: ").append(c.getString(1)).append("\n");
            }
            textResultat.setText(sb.toString());
        });

        btnModifier.setOnClickListener(v -> {
            String idStr = editId.getText().toString().trim();
            if (idStr.isEmpty()) {
                Toast.makeText(this, "Entrer un ID pour modifier", Toast.LENGTH_SHORT).show();
                return;
            }
            int id = Integer.parseInt(idStr);
            boolean updated = db.updateClient(id, editNom.getText().toString());
            Toast.makeText(this, updated ? "Client modifié" : "Aucun client trouvé", Toast.LENGTH_SHORT).show();
        });

        btnSupprimer.setOnClickListener(v -> {
            String idStr = editId.getText().toString().trim();
            if (idStr.isEmpty()) {
                Toast.makeText(this, "Entrer un ID pour supprimer", Toast.LENGTH_SHORT).show();
                return;
            }
            int id = Integer.parseInt(idStr);
            boolean deleted = db.deleteClient(id);
            Toast.makeText(this, deleted ? "Client supprimé" : "Aucun client trouvé", Toast.LENGTH_SHORT).show();
        });

        btnClear.setOnClickListener(v -> {
            editNom.setText("");
            editId.setText("");
            textResultat.setText("");
        });

    }
}
