package re.ermix.atelier8;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // show toast
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        // show toast
        btn1.setOnClickListener(v -> Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show());

        btn2.setOnClickListener(v -> Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_LONG).show());

        // dialog with 1 button
        btn3.setOnClickListener(v -> new AlertDialog.Builder(MainActivity.this)
                .setTitle("boite de dialogue")
                .setIcon(R.drawable.ic_launcher_background)
                .setMessage("Message de la boite")
                .setPositiveButton("OK", (dialog, which) -> {
                    // Action après le click du boutton de la boite

                })
                .show());

        // dialog with 2 buttons
        btn4.setOnClickListener(v -> new AlertDialog.Builder(MainActivity.this)
                .setTitle("boite de dialogue")
                .setIcon(R.drawable.ic_launcher_background)
                .setMessage("Message de la boite")
                .setPositiveButton("Oui", (dialog, which) -> {
                    // Action après le click du boutton de la boite
                })
                .setNegativeButton("Non", (dialog, which) -> {
                    // Action après le click du boutton de la boite
                })
                .show());


        // dialog with 3 buttons and input field
        btn5.setOnClickListener(v -> new AlertDialog.Builder(MainActivity.this)
                .setTitle("boite de dialogue")
                .setIcon(R.drawable.ic_launcher_background)
                .setMessage("Veuillez saisir un texte :")
                .setPositiveButton("Valider", (dialog, which) -> {
                    // Action après le click du boutton de la boite
                    var input = new EditText(MainActivity.this);
                    String texte = input.getText().toString();
                    Toast.makeText(getApplicationContext(), "Saisi : " + texte, Toast.LENGTH_LONG).show();
                })
                .setNegativeButton("Annuler", (dialog, which) -> {
                    // Action après le click du boutton de la boite
                })
                .setNeutralButton("Aide", (dialog, which) -> {
                    // Action après le click du boutton de la boite
                    Toast.makeText(getApplicationContext(), "Entrez un texte puis cliquez sur Valider.", Toast.LENGTH_SHORT).show();
                })
                .setView(new EditText(MainActivity.this))
                .show());

    }
}