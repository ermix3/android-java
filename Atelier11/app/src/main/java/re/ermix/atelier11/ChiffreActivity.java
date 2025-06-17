package re.ermix.atelier11;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ChiffreActivity extends AppCompatActivity {

    private void playSound(int soundRes) {
        MediaPlayer mp = MediaPlayer.create(this, soundRes);
        mp.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Chiffres");
        setContentView(R.layout.activity_chiffre);

        findViewById(R.id.img0).setOnClickListener(v -> playSound(R.raw.a1));
        findViewById(R.id.img1).setOnClickListener(v -> playSound(R.raw.a1));
        findViewById(R.id.img2).setOnClickListener(v -> playSound(R.raw.a2));
        findViewById(R.id.img3).setOnClickListener(v -> playSound(R.raw.a3));
        findViewById(R.id.img4).setOnClickListener(v -> playSound(R.raw.a4));
        findViewById(R.id.img5).setOnClickListener(v -> playSound(R.raw.a5));
        findViewById(R.id.img6).setOnClickListener(v -> playSound(R.raw.a6));
        findViewById(R.id.img7).setOnClickListener(v -> playSound(R.raw.a7));
        findViewById(R.id.img8).setOnClickListener(v -> playSound(R.raw.a8));
        findViewById(R.id.img9).setOnClickListener(v -> playSound(R.raw.a9));
    }
}
