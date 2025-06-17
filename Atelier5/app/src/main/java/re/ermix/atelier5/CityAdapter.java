package re.ermix.atelier5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CityAdapter extends ArrayAdapter<City> {

    public CityAdapter(Context context, List<City> cities) {
        super(context, 0, cities);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_city, parent, false);
        }

        City city = getItem(position);

        ImageView imageView = convertView.findViewById(R.id.cityImage);
        TextView textView = convertView.findViewById(R.id.cityName);

        imageView.setImageResource(city.getImageResource());
        textView.setText(city.getName());

        return convertView;
    }
}