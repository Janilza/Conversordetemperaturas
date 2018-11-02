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

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textViewCelsius = (TextView) findViewById(R.id.textViewCelsius);
        TextView textViewFahrenheit = (TextView) findViewById(R.id.textViewFahrenheit);
        Double celsius = AppData.temperatura.getCelsius();
        Double fahrenheit = AppData.temperatura.getFahrenheit();

        DecimalFormat df = new DecimalFormat("#.00");//formatar o numero de casas decimais
        textViewCelsius.setText(df.format(celsius));
        textViewFahrenheit.setText(df.format(fahrenheit));

    }

}
