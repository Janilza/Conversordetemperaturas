package pt.ipg.conversordetemperaturas;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MostraTemperaturaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_temperatura);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textViewCelsius = (TextView) findViewById(R.id.textViewCelsius);
        TextView textViewFahrenheit = (TextView) findViewById(R.id.textViewFahrenheit);

        Double celsius = AppData.temperatura.getCelsius();
        Double fahrenheit = AppData.temperatura.getFahrenheit();

        textViewCelsius.setText(String.format("%.2f", celsius));
        textViewFahrenheit.setText(String.format("%.2f", fahrenheit));
    }
}
