package bdg.iakgoogle.intermediate1.adapter;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import bdg.iakgoogle.intermediate1.R;
import bdg.iakgoogle.intermediate1.entity.Cuaca;

/**
 * Created by Admin on 1/23/2018.
 */

public class CuacaAdapter extends ArrayAdapter<Cuaca> {
    private final AppCompatActivity context;
    private final Cuaca[] cuaca;

    public CuacaAdapter(AppCompatActivity context, Cuaca[] cuaca) {
        super(context, R.layout.items, cuaca);
        this.context = context;
        this.cuaca = cuaca;
    }

    public View getView(int position, View view, ViewGroup parent) {

        //deklarasi inflater
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.items, null, true);

        //deklarasi id
        TextView txtTitle = (TextView) rowView.findViewById(R.id.title);
        ImageView image = (ImageView) rowView.findViewById(R.id.image);

        //set data
        txtTitle.setText(cuaca[position].getTitle());
        image.setBackgroundResource(cuaca[position].getImage());

        return rowView;
    }
}
