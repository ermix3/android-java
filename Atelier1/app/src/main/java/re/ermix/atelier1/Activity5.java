package re.ermix.atelier1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity5 extends AppCompatActivity {

    EditText e1, e2;
    TextView t4;
    Button bCalcul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        t4 = findViewById(R.id.t4);
        bCalcul = findViewById(R.id.bCalcul);

        bCalcul.setOnClickListener(v -> {
            int n1 = Integer.parseInt(e1.getText().toString());
            int n2 = Integer.parseInt(e2.getText().toString());
            int res = n1 + n2;
            t4.setText(String.valueOf(res));
        });
    }
}