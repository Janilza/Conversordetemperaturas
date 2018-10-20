package pt.ipg.conversordetemperaturas;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TemperatureUnitTest {

    public static final double Tolerancia_decimais = 0.001;

    @Test
    public void ConversaoTemperaturaCorreta() {
        Temperatura x = new TemperaturaCelsius(13);

        assertEquals(13.0,x.getCelsius(), Tolerancia_decimais);
        assertEquals(55.4,x.getFahrenheit(), Tolerancia_decimais);

        x = new TemperaturaFahrenheit( 39.2 );
        assertEquals(4.0,x.getCelsius(), Tolerancia_decimais);
        assertEquals(39.2,x.getFahrenheit(), Tolerancia_decimais);

        x = new TemperaturaFahrenheit( 23.0 );
        assertEquals(23.0,x.getCelsius(), Tolerancia_decimais);
        assertEquals(73.4,x.getFahrenheit(), Tolerancia_decimais);
}
}