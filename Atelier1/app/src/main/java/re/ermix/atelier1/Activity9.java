package re.ermix.atelier1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);

        Button b4 = findViewById(R.id.b4);
        b4.setOnClickListener(v -> {
            // Retour à `Activity7` en fermant toutes les activités
            Intent i = new Intent(Activity9.this, Activity7.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        });
    }
}