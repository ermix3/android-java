package re.ermix.atelier12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AnimalAdapter extends BaseAdapter {

    private Context context;
    private List<Animal> animals;

    public AnimalAdapter(Context context, List<Animal> animals) {
        this.context = context;
        this.animals = animals;
    }

    @Override
    public int getCount() {
        return animals.size();
    }

    @Override
    public Object getItem(int position) {
        return animals.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_item_animal, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.animalImage);
        TextView textView = convertView.findViewById(R.id.animalName);

        Animal animal = animals.get(position);
        imageView.setImageResource(animal.getImageResource());
        textView.setText(animal.getName());

        return convertView;
    }
}