package re.ermix.atelier7;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AnimalDetailActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_detail);

        // Récupération des données de l'animal
        String name = getIntent().getStringExtra("name");
        int imageRes = getIntent().getIntExtra("image", 0);
        final int soundRes = getIntent().getIntExtra("sound", 0);
        String description = getIntent().getStringExtra("description");

        // Initialisation des vues
        ImageView animalImage = findViewById(R.id.animalDetailImage);
        TextView animalName = findViewById(R.id.animalDetailName);
        TextView animalDescription = findViewById(R.id.animalDetailDescription);
        Button btnPlaySound = findViewById(R.id.btnPlaySound);

        // Affichage des données
        animalImage.setImageResource(imageRes);
        animalName.setText(name);
        animalDescription.setText(description);

        // Gestion du son
        btnPlaySound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(AnimalDetailActivity.this, soundRes);
                mediaPlayer.start();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}