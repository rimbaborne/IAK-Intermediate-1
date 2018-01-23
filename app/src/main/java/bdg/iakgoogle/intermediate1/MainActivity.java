package bdg.iakgoogle.intermediate1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import bdg.iakgoogle.intermediate1.adapter.CuacaAdapter;
import bdg.iakgoogle.intermediate1.entity.Cuaca;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private Cuaca[] cuaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        CuacaAdapter adapter = new CuacaAdapter(this, cuaca);

        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);

                //variabel yang dibawa ke detail activity
                intent.putExtra("image", cuaca[position].getImage());
                intent.putExtra("title", cuaca[position].getTitle());
                intent.putExtra("information", cuaca[position].getInformation());

                startActivity(intent);
            }
        });
    }

    //data
    private void initData(){
        cuaca = new Cuaca[]{
                new Cuaca(R.drawable.art_clouds,"Mendung", "Saat ini sedang mendung"),
                new Cuaca(R.drawable.art_clear,"Panas", "Saat ini sedang panas"),
                new Cuaca(R.drawable.art_light_rain,"Hujan", "Saat ini sedang hujan"),
                new Cuaca(R.drawable.art_light_clouds,"Berawan", "Saat ini sedang Berawan")
        };
    }
}
