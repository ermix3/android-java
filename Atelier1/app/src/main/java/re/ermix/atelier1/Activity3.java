package re.ermix.atelier1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    EditText editText;
    Button btnAfficher, btnEffacer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        editText = findViewById(R.id.editText);
        btnAfficher = findViewById(R.id.btnAfficher);
        btnEffacer = findViewById(R.id.btnEffacer);

        btnAfficher.setOnClickListener(v -> editText.setText("Bonjour"));
        btnEffacer.setOnClickListener(v -> editText.setText(""));
    }
}