package re.ermix.atelier11;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imgChat, imgChien;
    MediaPlayer mediaPlayerChat, mediaPlayerChien;
    Button btnChiffre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Mon App - Animaux");
        setContentView(R.layout.activity_main);

        imgChat = findViewById(R.id.imgChat);
        imgChien = findViewById(R.id.imgChien);
        btnChiffre = findViewById(R.id.btnChiffre);


        mediaPlayerChat = MediaPlayer.create(this, R.raw.chat);
        mediaPlayerChien = MediaPlayer.create(this, R.raw.chien);

        imgChat.setOnClickListener(v -> {
            Toast.makeText(this, "Coucou Chat !", Toast.LENGTH_SHORT).show();
            mediaPlayerChat.start();
        });

        imgChien.setOnClickListener(v -> {
            Toast.makeText(this, "Coucou Chien !", Toast.LENGTH_SHORT).show();
            mediaPlayerChien.start();
        });

        btnChiffre.setOnClickListener(v -> {
            var intent = new Intent(this, ChiffreActivity.class);
            startActivity(intent);
        });
    }
}
