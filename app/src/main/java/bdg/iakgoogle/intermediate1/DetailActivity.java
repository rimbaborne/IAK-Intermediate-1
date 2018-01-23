package bdg.iakgoogle.intermediate1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private ImageView image;
    private TextView txtTitle;
    private TextView txtInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        image = (ImageView) findViewById(R.id.image);
        txtTitle = (TextView) findViewById(R.id.title);
        txtInformation = (TextView) findViewById(R.id.information);

        //deklarasi intent, jika ada maka di get
        Intent intent = getIntent();

        //intent di ambil datanya lewat bundle
        Bundle bundle = intent.getExtras();

        //peletakan dari bundle yang telah diambil
        image.setBackgroundResource(bundle.getInt("image"));
        txtTitle.setText(bundle.getString("title"));
        txtInformation.setText((bundle.getString("information")));
    }
}
