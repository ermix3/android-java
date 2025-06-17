package re.ermix.atelier5;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class AdvancedListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        List<City> cities = List.of(
                new City("Agadir", R.drawable.agadir),
                new City("Casablanca", R.drawable.casa),
                new City("El Jadida", R.drawable.eljadida),
                new City("Essaouira", R.drawable.essaouira),
                new City("Fès", R.drawable.fes),
                new City("Meknes", R.drawable.meknes),
                new City("Marrakech", R.drawable.merrakech),
                new City("Oujda", R.drawable.oujda),
                new City("Rabat", R.drawable.rabat),
                new City("Tanger", R.drawable.tanger)
        );

        ListView listView = findViewById(R.id.listView);
        CityAdapter adapter = new CityAdapter(this, cities);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            City selectedCity = cities.get(position);
            Toast.makeText(this, selectedCity.getName(), Toast.LENGTH_SHORT).show();
        });
    }
}