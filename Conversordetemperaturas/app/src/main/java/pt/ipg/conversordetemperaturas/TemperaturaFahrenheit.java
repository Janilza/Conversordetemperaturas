package pt.ipg.conversordetemperaturas;

public class TemperaturaFahrenheit extends Temperatura {
    @Override
    public double getFahrenheit() {
        return valor;
    }

    @Override
    public double getCelsius() {
        return (valor - 32.0)/(9.0/5.0);
    }
}
