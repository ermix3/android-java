package re.ermix.atelier7;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class AnimalListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_list);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Chat", R.drawable.chat, R.raw.chat, "Le chat est un animal domestique très apprécié"));
        animals.add(new Animal("Chien", R.drawable.chien, R.raw.chien, "Le chien est le meilleur ami de l'homme"));
//        animals.add(new Animal("Lion", R.drawable.lion, R.raw.lion_sound, "Le lion est le roi de la jungle"));
//        animals.add(new Animal("Éléphant", R.drawable.elephant, R.raw.elephant_sound, "L'éléphant est le plus grand animal terrestre"));
//        animals.add(new Animal("Singe", R.drawable.monkey, R.raw.monkey_sound, "Le singe est très intelligent et agile"));
//        animals.add(new Animal("Zèbre", R.drawable.zebra, R.raw.zebra_sound, "Le zèbre est reconnaissable à ses rayures"));
//        animals.add(new Animal("Girafe", R.drawable.giraffe, R.raw.giraffe_sound, "La girafe est l'animal le plus grand"));
//        animals.add(new Animal("Tigre", R.drawable.tiger, R.raw.tiger_sound, "Le tigre est un puissant prédateur"));

        GridView gridView = findViewById(R.id.gridView);
        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener((parent, view, position, id) -> {
            Animal selectedAnimal = animals.get(position);

            Intent intent = new Intent(AnimalListActivity.this, AnimalDetailActivity.class);
            intent.putExtra("name", selectedAnimal.getName());
            intent.putExtra("image", selectedAnimal.getImageResource());
            intent.putExtra("sound", selectedAnimal.getSoundResource());
            intent.putExtra("description", selectedAnimal.getDescription());
            startActivity(intent);
        });
    }
}