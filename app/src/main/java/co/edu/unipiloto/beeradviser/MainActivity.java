package co.edu.unipiloto.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void onClickFindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());

        List<String> beerList = new ArrayList<String>(BeerExpert.getBrands(beerType));

        StringBuilder builder = new StringBuilder();
        for (String b: beerList) {
            builder.append(b + "\n");
        }

        brands.setText(builder.toString());
        //brands.setText(BeerExpert.getBrands(beerType).toString());
    }
}