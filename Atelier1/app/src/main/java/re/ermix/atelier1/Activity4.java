package re.ermix.atelier1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Activity4 extends AppCompatActivity {

    EditText t1, t2, t3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        b1 = findViewById(R.id.b1);

        b1.setOnClickListener(v -> {
            String texte = t1.getText().toString();
            t2.setText(texte);
            t3.setText(String.valueOf(texte.length()));
        });
    }
}