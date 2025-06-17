package re.ermix.atelier5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSimpleList = findViewById(R.id.btnSimpleList);
        Button btnGridView = findViewById(R.id.btnGridView);
        Button btnSpinner = findViewById(R.id.btnSpinner);
        Button btnAdvancedList = findViewById(R.id.btnAdvancedList);

        btnSimpleList.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SimpleListActivity.class));
        });

        btnGridView.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, GridViewActivity.class));
        });

        btnSpinner.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
        });

        btnAdvancedList.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AdvancedListActivity.class));
        });
    }
}